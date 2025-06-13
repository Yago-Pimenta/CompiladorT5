package br.ufscar.dc.compiladores.meu.lexico;
import static br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.TipoDadoLA.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.Categoria;
import br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.EntradaSimbolo;
import br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.TipoDadoLA;

import static br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.TipoDadoLA.*;

public class LaSemantico extends MeuParserBaseVisitor{
    private int funcDepth = 0;
    Contexto contexto = new Contexto();

    @Override
    public Object visitDeclaracao_constante(MeuParser.Declaracao_constanteContext ctx) {
        SimbolosTabela tabelaAtual = contexto.obterContextoAtual();
        String nome = ctx.IDENT().getText();
        String tipoStr = ctx.tipo_basico().getText();
    
        if (tabelaAtual.contem(nome)) {
            LaSemanticoUtils.adicionarErroSemantico(
                ctx.start,
                "constante " + nome + " ja declarada anteriormente"
            );
        }
        // sempre insere, para não gerar cascata de "nao declarado"
        tabelaAtual.inserir(
            nome,
            SimbolosTabela.Categoria.CONST,
            tipoStr,
            java.util.Collections.emptyList()
        );
        return super.visitDeclaracao_constante(ctx);
    }
   // antes do construtor
private Map<String, List<String>> recordFields     = new HashMap<>();
private Map<String, List<String>> recordFieldTypes = new HashMap<>();
 
@Override
public Object visitDeclaracao_tipo(MeuParser.Declaracao_tipoContext ctx) {
    SimbolosTabela tabelaAtual = contexto.obterContextoAtual();
    String nomeTipo = ctx.IDENT().getText();

    if (tabelaAtual.contem(nomeTipo)) {
        LaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeTipo + " ja declarado anteriormente");
    }

    tabelaAtual.inserir(nomeTipo, SimbolosTabela.Categoria.TYPE, nomeTipo, java.util.Collections.emptyList());

    if (ctx.tipo().registro() != null) {
        List<String> campos = new ArrayList<>();
        List<String> tipos = new ArrayList<>();
        for (MeuParser.VariavelContext var : ctx.tipo().registro().variavel()) {
            String tipoCampo = var.tipo().getText();
            for (MeuParser.IdentificadorContext idCtx : var.identificador()) {
                campos.add(idCtx.getText());
                tipos.add(tipoCampo);
            }
        }
        recordFields.put(nomeTipo, campos);
        recordFieldTypes.put(nomeTipo, tipos);
    }

    return null;
}

    
@Override
public Object visitDeclaracao_global(MeuParser.Declaracao_globalContext ctx) {
    boolean isFunc = ctx.getChild(0).getText().equals("funcao");
    if (isFunc) funcDepth++;

    // Contexto global
    SimbolosTabela tabelaGlobal = contexto.obterContextoAtual();
    String id = ctx.IDENT().getText();
    SimbolosTabela.Categoria cat = isFunc
        ? SimbolosTabela.Categoria.FUNC
        : SimbolosTabela.Categoria.PROC;

    // --- 1) Monta lista de parâmetros (nome + tipo), sem inserir ainda ---
    List<SimbolosTabela.EntradaSimbolo> params = new ArrayList<>();
    if (ctx.parametros() != null) {
        for (MeuParser.ParametroContext p : ctx.parametros().parametro()) {
            // pega o nome literal do tipo (ex: "tRacional")
            String tipoNome = p.tipo_estendido().getText();
            for (MeuParser.IdentificadorContext idParam : p.identificador()) {
                String nomeParam = idParam.getText();
                params.add(new SimbolosTabela.EntradaSimbolo(
                    nomeParam,
                    SimbolosTabela.Categoria.PARAM,
                    tipoNome,
                    Collections.emptyList()
                ));
            }
        }
    }

    // --- 2) Verifica duplicata no global ---
    if (tabelaGlobal.contem(id)) {
        LaSemanticoUtils.adicionarErroSemantico(
            ctx.start,
            "identificador " + id + " ja declarado anteriormente"
        );
    }

    // --- 3) Insere PROC/FUNC no escopo global ---
    List<SimbolosTabela.TipoDadoLA> tiposParams = new ArrayList<>();
    for (SimbolosTabela.EntradaSimbolo p : params) {
        tiposParams.add(LaSemanticoUtils.getTipo(p.tipo));
    }
    String tipoRetorno = isFunc ? ctx.tipo_estendido().getText() : "";
    tabelaGlobal.inserir(id, cat, tipoRetorno, tiposParams);

    // --- 4) Cria contexto local e insere parâmetros + campos de registro ---
    contexto.iniciarNovoContexto();
    for (SimbolosTabela.EntradaSimbolo p : params) {
        // insere o parâmetro
        contexto.obterContextoAtual().inserir(
            p.nome,
            SimbolosTabela.Categoria.PARAM,
            p.tipo,
            Collections.emptyList()
        );
        // se for registro, insere também os campos (ex: racional.numerador)
        if (recordFields.containsKey(p.tipo)) {
            List<String> campos = recordFields.get(p.tipo);
            List<String> tiposCampos = recordFieldTypes.get(p.tipo);
            for (int i = 0; i < campos.size(); i++) {
                String nomeCampo = p.nome + "." + campos.get(i);
                contexto.obterContextoAtual().inserir(
                    nomeCampo,
                    SimbolosTabela.Categoria.VAR,
                    tiposCampos.get(i),
                    Collections.emptyList()
                );
            }
        }
    }

    // --- 5) Visita o corpo e finaliza ---
    super.visitDeclaracao_global(ctx);
    contexto.sairDoContexto();
    if (isFunc) funcDepth--;
    return null;
}


    public SimbolosTabela.TipoDadoLA processaChamadaFuncao(Contexto contexto, String nome, List<MeuParser.ExpressaoContext> args) {
        // Procura função na tabela
        SimbolosTabela.RegistroSimbolo reg = null;
        for (SimbolosTabela esc : contexto.listarContextosAninhados()) {
            reg = esc.consultarRegistro(nome);
            if (reg != null) break;
        }
        if (reg == null) {
            LaSemanticoUtils.adicionarErroSemantico(null, "identificador " + nome + " nao declarado");
            return SimbolosTabela.TipoDadoLA.INVALIDO;
        }
        if (reg.categoria != SimbolosTabela.Categoria.FUNC) {
            LaSemanticoUtils.adicionarErroSemantico(null, "identificador " + nome + " nao e funcao");
        }
    
        // Verifica argumentos
        if (reg.params == null || reg.params.size() != args.size()) {
            LaSemanticoUtils.adicionarErroSemantico(null, "incompatibilidade de parametros na chamada de " + nome);
        } else {
            for (int i = 0; i < args.size(); i++) {
                SimbolosTabela.TipoDadoLA tipoArg = LaSemanticoUtils.determinarTipo(contexto, args.get(i));
                SimbolosTabela.TipoDadoLA tipoEsperado = reg.params.get(i);
                if (tipoArg != tipoEsperado) {
                    LaSemanticoUtils.adicionarErroSemantico(null, "incompatibilidade de parametros na chamada de " + nome);
                    break;
                }
            }
        }
    
        return LaSemanticoUtils.getTipo(reg.tipoNome);
    }
    
    
    
    @Override
    public Object visitDeclaracao_variavel(MeuParser.Declaracao_variavelContext ctx) {
        SimbolosTabela tabelaAtual = contexto.obterContextoAtual();
        MeuParser.TipoContext tipoCtx = ctx.variavel().tipo();
        boolean isInline = tipoCtx.registro() != null;
        String tipoStr = tipoCtx.getText();
        boolean isAlias = recordFields.containsKey(tipoStr);
    
        for (MeuParser.IdentificadorContext idCtx : ctx.variavel().identificador()) {
            String nomeVar = idCtx.IDENT(0).getText();
            System.out.println(">> Inserindo variável: " + nomeVar);
    
            // 1) Verifica se já foi declarado
            if (tabelaAtual.contem(nomeVar)) {
                LaSemanticoUtils.adicionarErroSemantico(
                    idCtx.start,
                    "identificador " + nomeVar + " ja declarado anteriormente"
                );
                continue;
            }
    
            // 2) Verifica se tipo existe (quando não for registro inline nem alias)
            if (!isInline && !isAlias && !tipoStr.startsWith("^")) {
                String base = tipoStr.startsWith("^") ? tipoStr.substring(1) : tipoStr;
                boolean tipoValido;
                if (base.equals("inteiro") || base.equals("real") || base.equals("literal") || base.equals("logico")) {
                    tipoValido = true;
                } else {
                    tipoValido = contexto.listarContextosAninhados()
                                         .stream()
                                         .anyMatch(e -> e.contem(base));
                }
                if (!tipoValido) {
                    LaSemanticoUtils.adicionarErroSemantico(
                        tipoCtx.start,
                        "tipo " + tipoStr + " nao declarado"
                    );
                }
            }
    
            // 3) Define categoria
            SimbolosTabela.Categoria cat;
            if (tipoStr.startsWith("^")) {
                cat = SimbolosTabela.Categoria.POINTER;
            } else if (isInline || isAlias) {
                cat = SimbolosTabela.Categoria.RECORD;
            } else {
                cat = SimbolosTabela.Categoria.VAR;
            }
    
            // 4) Insere variável principal
            tabelaAtual.inserir(
                nomeVar,
                cat,
                tipoStr,
                java.util.Collections.emptyList()
            );
    
            // 5) Se for registro, insere os campos
            if (cat == SimbolosTabela.Categoria.RECORD) {
                List<String> campos;
                List<String> tipos;
    
                if (isAlias) {
                    campos = recordFields.get(tipoStr);
                    tipos = recordFieldTypes.get(tipoStr);
                } else {
                    campos = new ArrayList<>();
                    tipos = new ArrayList<>();
                    for (MeuParser.VariavelContext varCampo : tipoCtx.registro().variavel()) {
                        String tipoCampo = varCampo.tipo().getText();
                        for (MeuParser.IdentificadorContext cid : varCampo.identificador()) {
                            campos.add(cid.getText());
                            tipos.add(tipoCampo);
                        }
                    }
                }
    
                for (int i = 0; i < campos.size(); i++) {
                    String nomeCampo = nomeVar + "." + campos.get(i);
                    System.out.println(">> Inserindo campo: " + nomeCampo);
                    tabelaAtual.inserir(
                        nomeCampo,
                        SimbolosTabela.Categoria.VAR,
                        tipos.get(i),
                        java.util.Collections.emptyList()
                    );
                }
            }
        }
    
        return null;
    }
    
  
    @Override
    public Object visitCmdLeia(MeuParser.CmdLeiaContext ctx) {
        // percorre cada expressão passada ao leia()
        for (MeuParser.ExpressaoContext expr : ctx.expressao()) {
                   expr.accept(this);
               }
        return null;
    }
    
    
    
    


    @Override
    public Object visitCmdEscreva(MeuParser.CmdEscrevaContext ctx) {
        return super.visitCmdEscreva(ctx); // deixa o ANTLR percorrer normalmente
    }
    
    
    
    

    
@Override
public Object visitCmdRetorne(MeuParser.CmdRetorneContext ctx) {
    // se não estivermos dentro de nenhuma função, é erro
    if (funcDepth == 0) {
        LaSemanticoUtils.adicionarErroSemantico(
            ctx.start,
            "comando retorne nao permitido nesse escopo"
        );
    }
    return super.visitCmdRetorne(ctx);
}


@Override
public Object visitIdentificador(MeuParser.IdentificadorContext ctx) {
    String nomeCompleto = ctx.IDENT().stream()
        .map(TerminalNode::getText)
        .collect(java.util.stream.Collectors.joining("."));

    System.out.println("==> visitIdentificador: " + nomeCompleto);

    for (SimbolosTabela esc : contexto.listarContextosAninhados()) {
        if (esc.contem(nomeCompleto)) {
            System.out.println("✔ encontrado: " + nomeCompleto);
            return esc.consultarTipoDado(nomeCompleto);
        }
    }

    System.out.println("❌ nao encontrado: " + nomeCompleto);
    LaSemanticoUtils.adicionarErroSemantico(
        ctx.start,
        "identificador " + nomeCompleto + " nao declarado"
    );
    return SimbolosTabela.TipoDadoLA.INVALIDO;
}






@Override
public Object visitCmdAtribuicao(MeuParser.CmdAtribuicaoContext ctx) {
    String rawNome  = ctx.identificador().getText();
    String nomeBase = ctx.identificador().IDENT(0).getText();
    boolean isDesreferenciado = ctx.getText().startsWith("^");

    // 1) lookup completo (campo de registro)
    SimbolosTabela.RegistroSimbolo regEsq = null;
    for (SimbolosTabela esc : contexto.listarContextosAninhados()) {
        regEsq = esc.consultarRegistro(rawNome);
        if (regEsq != null) break;
    }
    // 2) fallback para nome base
    if (regEsq == null) {
        for (SimbolosTabela esc : contexto.listarContextosAninhados()) {
            regEsq = esc.consultarRegistro(nomeBase);
            if (regEsq != null) break;
        }
    }
    if (regEsq == null) {
        return super.visitCmdAtribuicao(ctx);
    }

    // 3) determina tipos
    SimbolosTabela.TipoDadoLA tipoDir   = LaSemanticoUtils.determinarTipo(contexto, ctx.expressao());
    SimbolosTabela.TipoDadoLA tipoEsqLA = mapStringParaTipoDado(regEsq.tipoNome.replace("^", ""));
    boolean compat = false;

    // 3a) ^ponteiro <- valor
    if (isDesreferenciado && regEsq.categoria == SimbolosTabela.Categoria.POINTER) {
        if ( ((tipoEsqLA == SimbolosTabela.TipoDadoLA.INTEIRO || tipoEsqLA == SimbolosTabela.TipoDadoLA.REAL)
               && (tipoDir   == SimbolosTabela.TipoDadoLA.INTEIRO || tipoDir   == SimbolosTabela.TipoDadoLA.REAL))
             || tipoEsqLA == tipoDir ) {
            compat = true;
        }
    }
    // 3b) ponteiro <- &valor
    else if (regEsq.categoria == SimbolosTabela.Categoria.POINTER
          && tipoDir == SimbolosTabela.TipoDadoLA.INVALIDO) {
        compat = true;
    }
    // 3c) primitivos e misturas inteiro↔real
    else {
        if ( ((tipoEsqLA == SimbolosTabela.TipoDadoLA.INTEIRO || tipoEsqLA == SimbolosTabela.TipoDadoLA.REAL)
               && (tipoDir   == SimbolosTabela.TipoDadoLA.INTEIRO || tipoDir   == SimbolosTabela.TipoDadoLA.REAL))
             || tipoEsqLA == tipoDir ) {
            compat = true;
        }
    }

    // 4) reporta se incompatível
    if (!compat) {
        LaSemanticoUtils.adicionarErroSemantico(
            ctx.identificador().start,
            "atribuicao nao compativel para " + rawNome
        );
    }

    return super.visitCmdAtribuicao(ctx);
}

@Override
public Object visitParcela_unario(MeuParser.Parcela_unarioContext ctx) {
    if (ctx.identificador() != null && ctx.identificador().IDENT().size() > 0) {
        // Chamada de função
        String nomeFunc = ctx.identificador().IDENT(0).getText();
        SimbolosTabela.RegistroSimbolo func = null;

        // Busca no contexto
        for (SimbolosTabela escopo : contexto.listarContextosAninhados()) {
            func = escopo.consultarRegistro(nomeFunc);
            if (func != null) break;
        }

        if (func != null && func.categoria == SimbolosTabela.Categoria.FUNC) {
            return mapStringParaTipoDado(func.tipoNome);
        }

        return SimbolosTabela.TipoDadoLA.INVALIDO;
    }

    return super.visitParcela_unario(ctx);
}


    
    // ---- Auxiliar em LaSemantico.java ----
    private SimbolosTabela.TipoDadoLA mapStringParaTipoDado(String texto) {
        switch (texto) {
            case "inteiro": return SimbolosTabela.TipoDadoLA.INTEIRO;
            case "real":    return SimbolosTabela.TipoDadoLA.REAL;
            case "literal": return SimbolosTabela.TipoDadoLA.CADEIA;
            case "logico":  return SimbolosTabela.TipoDadoLA.LOGICO;
            default:        return SimbolosTabela.TipoDadoLA.INVALIDO;
        }
    }
    


    
    }
    