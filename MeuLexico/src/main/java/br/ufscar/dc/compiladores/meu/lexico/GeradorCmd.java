package br.ufscar.dc.compiladores.meu.lexico;

import br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.TipoDadoLA;
import static br.ufscar.dc.compiladores.meu.lexico.LaSemanticoUtils.*;
import br.ufscar.dc.compiladores.meu.lexico.MeuParser.*;
import java.util.List;

/**
 * Geração de código C para comandos em LA.
 */
public class GeradorCmd extends GeradorDeclaracao {

    public GeradorCmd(Contexto contexto, StringBuilder sb) {
        super(contexto, sb);
    }
    
    @Override
    public Void visitCmd(CmdContext ctx) {
        if (ctx.cmdLeia() != null)       return visitCmdLeia(ctx.cmdLeia());
        if (ctx.cmdEscreva() != null)    return visitCmdEscreva(ctx.cmdEscreva());
        if (ctx.cmdAtribuicao() != null) return visitCmdAtribuicao(ctx.cmdAtribuicao());
        if (ctx.cmdSe() != null)         return visitCmdSe(ctx.cmdSe());
        if (ctx.cmdCaso() != null)       return visitCmdCaso(ctx.cmdCaso());
        if (ctx.cmdPara() != null)       return visitCmdPara(ctx.cmdPara());
        if (ctx.cmdEnquanto() != null)   return visitCmdEnquanto(ctx.cmdEnquanto());
        if (ctx.cmdFaca() != null)       return visitCmdFaca(ctx.cmdFaca());
        if (ctx.cmdChamada() != null)    return visitCmdChamada(ctx.cmdChamada());
        return null;
    }

    private String traduzirRelacional(String expr) {
        expr = expr.replace(">=", "__GE__").replace("<=", "__LE__");
        expr = expr.replace("<>", "!=");
        expr = expr.replace("=", "==");
        return expr.replace("__GE__", ">=")
                   .replace("__LE__", "<=");
    }
    
    @Override
    public Void visitCmdLeia(CmdLeiaContext ctx) {
        for (ExpressaoContext expCtx : ctx.expressao()) {
            TipoDadoLA tipo = determinarTipo(contexto, expCtx);
            sb.append("    scanf(\"%")
              .append(getCTypeSymbol(tipo))
              .append("\",&")
              .append(expCtx.getText())
              .append(");\n");
        }
        return null;
    }
    
    @Override
    public Void visitCmdEscreva(CmdEscrevaContext ctx) {
        // pega o texto da única expressão
        String txt = ctx.expressao().getText();
        if (txt.startsWith("\"") && txt.endsWith("\"")) {
            // literal de string: printf("…");
            sb.append("    printf(")
              .append(txt)
              .append(");\n");
        } else {
            // inteiro ou real: decide via determinarTipo
            TipoDadoLA tipo = determinarTipo(contexto, ctx.expressao());
            char spec = getCTypeSymbol(tipo).charAt(0);
            sb.append("    printf(\"%")
              .append(spec)
              .append("\",")
              .append(txt)
              .append(");\n");
        }
        return null;
    }
    
    @Override
    public Void visitCmdAtribuicao(CmdAtribuicaoContext ctx) {
        sb.append("    ")
          .append(ctx.identificador().getText())
          .append(" = ")
          .append(ctx.expressao().getText())
          .append(";\n");
        return null;
    }

    @Override
    public Void visitCmdSe(CmdSeContext ctx) {
        String cond = traduzirRelacional(ctx.expressao().getText());
        sb.append("    if (")
          .append(cond)
          .append(") {\n");
        for (CmdContext c : ctx.thenCmds) visitCmd(c);
        sb.append("    }");
        if (!ctx.elseCmds.isEmpty()) {
            sb.append(" else {\n");
            for (CmdContext c : ctx.elseCmds) visitCmd(c);
            sb.append("    }");
        }
        sb.append("\n");
        return null;
    }

    @Override
    public Void visitCmdCaso(CmdCasoContext ctx) {
        sb.append("    switch (")
          .append(ctx.exp_aritmetica().getText())
          .append(") {\n");
        for (Item_selecaoContext item : ctx.selecao().item_selecao()) {
            for (Numero_intervaloContext ni : item.constantes().numero_intervalo()) {
                String[] lim = ni.getText().split("\\.\\.");
                sb.append("        case ").append(lim[0]).append(":\n");
                for (CmdContext c : item.cmd()) visitCmd(c);
                sb.append("            break;\n");
            }
        }
        if (!ctx.elseCmds.isEmpty()) {
            sb.append("        default:\n");
            for (CmdContext c : ctx.elseCmds) visitCmd(c);
            sb.append("            break;\n");
        }
        sb.append("    }\n");
        return null;
    }

    @Override
    public Void visitCmdPara(CmdParaContext ctx) {
        String iter = ctx.IDENT().getText();
        String inicio = ctx.exp_aritmetica(0).getText();
        String fim    = ctx.exp_aritmetica(1).getText();
        sb.append("    for (int ").append(iter)
          .append(" = ").append(inicio)
          .append("; ").append(iter)
          .append(" <= ").append(fim)
          .append("; ").append(iter)
          .append("++) {\n");
        for (CmdContext c : ctx.cmd()) visitCmd(c);
        sb.append("    }\n");
        return null;
    }

    @Override
    public Void visitCmdEnquanto(CmdEnquantoContext ctx) {
        String cond = traduzirRelacional(ctx.expressao().getText());
        sb.append("    while (")
          .append(cond)
          .append(") {\n");
        for (CmdContext c : ctx.cmd()) visitCmd(c);
        sb.append("    }\n");
        return null;
    }

    @Override
    public Void visitCmdFaca(CmdFacaContext ctx) {
        sb.append("    do {\n");
        for (CmdContext c : ctx.cmd()) visitCmd(c);
        sb.append("    } while (")
          .append(ctx.expressao().getText())
          .append(");\n");
        return null;
    }

    @Override
    public Void visitCmdChamada(CmdChamadaContext ctx) {
        sb.append("    ").append(ctx.IDENT().getText()).append("(");
        List<ExpressaoContext> args = ctx.expressao();
        for (int i = 0; i < args.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(args.get(i).getText());
        }
        sb.append(");\n");
        return null;
    }
}
