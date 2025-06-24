package br.ufscar.dc.compiladores.meu.lexico;

import br.ufscar.dc.compiladores.meu.lexico.MeuParser.CmdCasoContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.Item_selecaoContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.Numero_intervaloContext;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.CmdContext;

/**
 * Geração de código C para estruturas de seleção (switch-case) em LA.
 */
public class GeradorSelecao extends GeradorCmd {
    public GeradorSelecao(Contexto contexto, StringBuilder sb) {
        super(contexto, sb);
    }

    @Override
    public Void visitCmdCaso(CmdCasoContext ctx) {
        sb.append("    switch (").append(ctx.exp_aritmetica().getText()).append(") {\n");
        // Gera cada case item
        for (Item_selecaoContext item : ctx.selecao().item_selecao()) {
            for (Numero_intervaloContext ni : item.constantes().numero_intervalo()) {
                String[] lim = ni.getText().split("\\.\\.");
                sb.append("        case ").append(lim[0]).append(":\n");
                for (CmdContext c : item.cmd()) {
                    visitCmd(c);
                }
                sb.append("            break;\n");
            }
        }

        // Bloco default (else)
        if (!ctx.elseCmds.isEmpty()) {
            sb.append("        default:\n");
            for (CmdContext c : ctx.elseCmds) {
                visitCmd(c);
            }
        }

        sb.append("    }\n");
        return null;
    }
}