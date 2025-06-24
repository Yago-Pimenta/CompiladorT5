package br.ufscar.dc.compiladores.meu.lexico;

import java.util.Objects;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.Decl_local_globalContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.Declaracao_globalContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.Declaracao_localContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.Declaracao_variavelContext;
import br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.TipoDadoLA;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.Declaracao_constanteContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.Declaracao_tipoContext;
import static br.ufscar.dc.compiladores.meu.lexico.MeuParser.*;

/**
 * Geração de código C para declarações (variáveis, constantes e tipos) em LA.
 */
public class GeradorDeclaracao extends GeradorCodigo {
    public GeradorDeclaracao(Contexto contexto, StringBuilder sb) {
        super(contexto, sb);
    }
    
    @Override
    public Void visitDecl_local_global(Decl_local_globalContext ctx) {
        if (ctx.declaracao_local() != null) {
            visitDeclaracao_local(ctx.declaracao_local());
        } else if (ctx.declaracao_global() != null) {
            visitDeclaracao_global(ctx.declaracao_global());
        }
        return null;
    }

    @Override
    public Void visitDeclaracao_global(Declaracao_globalContext ctx) {
        boolean isProc = ctx.getChild(0).getText().equals("procedimento");
        if (isProc) {
            sb.append("void ").append(ctx.IDENT().getText()).append("(");
        } else {
            String cTipo = LaSemanticoUtils.getCType(ctx.tipo_estendido().getText().replace("^", ""));
            visitTipo_estendido(ctx.tipo_estendido());
            if (Objects.equals(cTipo, "char")) {
                sb.append("[80]");
            }
            sb.append(" ").append(ctx.IDENT().getText()).append("(");
        }
        if (ctx.parametros() != null) {
            ctx.parametros().parametro().forEach(this::visitParametro);
        }
        sb.append(") {\n");
        if (ctx.declaracao_local() != null) {
            ctx.declaracao_local().forEach(this::visitDeclaracao_local);
        }
        if (ctx.cmd() != null) {
            ctx.cmd().forEach(this::visitCmd);
        }
        sb.append("}\n\n");
        return null;
    }

    @Override
    public Void visitDeclaracao_local(Declaracao_localContext ctx) {
        if (ctx.declaracao_variavel() != null) {
            visitDeclaracao_variavel(ctx.declaracao_variavel());
        } else if (ctx.declaracao_constante() != null) {
            visitDeclaracao_constante(ctx.declaracao_constante());
        } else if (ctx.declaracao_tipo() != null) {
            visitDeclaracao_tipo(ctx.declaracao_tipo());
        }
        return null;
    }

    @Override
    public Void visitDeclaracao_variavel(MeuParser.Declaracao_variavelContext ctx) {
        // percorre cada identificador
        for (MeuParser.IdentificadorContext idCtx : ctx.variavel().identificador()) {
            String nomeVar   = idCtx.getText();
            String textoTipo = ctx.variavel().tipo().getText();           // usa tipo() aqui, não tipo_basico()
            // converte texto→enum→tipoC numa linha só
            String cTipo = LaSemanticoUtils.getCType(textoTipo);         // requer sobrecarga getCType(String)
            sb.append("    ").append(cTipo).append(" ").append(nomeVar);
            if ("literal".equals(textoTipo)) {
                sb.append("[80]");
            }
            sb.append(";\n");
        }
        return null;
    }
    
    

    @Override
    public Void visitDeclaracao_constante(Declaracao_constanteContext ctx) {
        // dentro de visitDeclaracao_constante e visitVariavel, etc.
    ;
    // passo 1: pega texto do tipo
    String textoTipo = ctx.tipo_basico().getText();
// passo 2: converte para enum
    SimbolosTabela.TipoDadoLA tipoEnum = LaSemanticoUtils.getTipo(textoTipo);
    String tipoC     = LaSemanticoUtils.getCType(tipoEnum);

        sb.append("const ").append(tipoC)
          .append(" ").append(ctx.IDENT().getText())
          .append(" = ");
        visitValor_constante(ctx.valor_constante());
        sb.append(";\n");
        return null;
    }

    @Override
    public Void visitDeclaracao_tipo(Declaracao_tipoContext ctx) {
        sb.append("typedef ");
        visitRegistro(ctx.tipo().registro());
        sb.append(" ").append(ctx.IDENT().getText()).append(";\n");
        return null;
    }
}
