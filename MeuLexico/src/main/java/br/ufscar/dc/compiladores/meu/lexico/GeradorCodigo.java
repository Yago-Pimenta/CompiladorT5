package br.ufscar.dc.compiladores.meu.lexico;

import br.ufscar.dc.compiladores.meu.lexico.MeuParserBaseVisitor;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.ProgramaContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.DeclaracoesContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.CorpoContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.CmdContext;
import static br.ufscar.dc.compiladores.meu.lexico.MeuParser.*;

/**
 * Gerador de código C para a Linguagem LA.
 * Percorre a parse tree e gera o programa em C equivalente.
 */
public class GeradorCodigo extends MeuParserBaseVisitor<Void> {
    protected StringBuilder sb;

    protected Contexto contexto;

public GeradorCodigo(Contexto contexto, StringBuilder sb) {
    this.contexto = contexto;
    this.sb = sb;
}


    /**
     * Gera o código C completo a partir do ProgramaContext.
     * @param ctx Nó raiz do parser
     * @return String com o código-fonte em C
     */
    public String generate(ProgramaContext ctx) {
        sb.append("#include <stdio.h>\n");
        sb.append("#include <stdlib.h>\n\n");
        // －－－－－－－－－－－－－－－－－－－－－－－－
    
        sb.append("int main() {\n");
        // visita declarações, se houver
        if (ctx.declaracoes() != null) {
            visitDeclaracoes(ctx.declaracoes());
        }
        // visita corpo do algoritmo
        visitCorpo(ctx.corpo());
        sb.append("    return 0;\n");
        sb.append("}\n");
        return sb.toString();
    }
    @Override
    public Void visitDeclaracoes(MeuParser.DeclaracoesContext ctx) {
        // para cada declaração (variável, constante ou tipo)…
        for (MeuParser.Decl_local_globalContext decl : ctx.decl_local_global()) {
            // só nos interessam variáveis locais
            MeuParser.Declaracao_localContext local = decl.declaracao_local();
            if (local != null && local.declaracao_variavel() != null) {
                MeuParser.VariavelContext varCtx = local.declaracao_variavel().variavel();
                // cada identificador declarado
                for (MeuParser.IdentificadorContext idCtx : varCtx.identificador()) {
                    // converte texto do tipo LA em enum
                    SimbolosTabela.TipoDadoLA tipoLA = LaSemanticoUtils.getTipo(idCtx.getText());
                    // determina string C: "int", "double" ou "char"
                    String cTipo = LaSemanticoUtils.getCType(tipoLA);
                    sb.append("    ").append(cTipo).append(" ")
                      .append(idCtx.getText());
                    // se for literal (cadeia), reserva 80 chars
                    if (tipoLA == SimbolosTabela.TipoDadoLA.CADEIA) {
                        sb.append("[80]");
                    }
                    sb.append(";\n");
                }
            }
        }
        return null;
    }
    

    @Override
    public Void visitCorpo(CorpoContext ctx) {
        // TODO: implementar geração de comandos e declarações locais
        return super.visitCorpo(ctx);
    }

    @Override
    public Void visitCmd(CmdContext ctx) {
        // TODO: implementar geração de cada tipo de comando (leia, escreva, atribuição, etc.)
        return super.visitCmd(ctx);
    }
}
