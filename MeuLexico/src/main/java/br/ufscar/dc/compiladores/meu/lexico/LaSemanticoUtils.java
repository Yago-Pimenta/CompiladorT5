package br.ufscar.dc.compiladores.meu.lexico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.TipoDadoLA;

public class LaSemanticoUtils {

    public static List<String> listaErros = new ArrayList<>();

    public static void adicionarErroSemantico(Token tok, String msg) {
        int linha = tok.getLine();
        listaErros.add(String.format("Linha %d: %s", linha, msg));
    }

    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, String nome) {
        for (SimbolosTabela esc : escopos.listarContextosAninhados()) {
            SimbolosTabela.RegistroSimbolo reg = esc.consultarRegistro(nome);
            if (reg != null) {
                return esc.consultarTipoDado(nome);
            }
        }
        return SimbolosTabela.TipoDadoLA.INVALIDO;
    }

    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.Exp_relacionalContext ctx) {
        if (ctx.op_relacional() != null) {
            return SimbolosTabela.TipoDadoLA.LOGICO;
        }
        return determinarTipo(escopos, ctx.exp_aritmetica(0));
    }
    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.Exp_aritmeticaContext ctx) {
        SimbolosTabela.TipoDadoLA tipo = null;
        for (MeuParser.TermoContext t : ctx.termo()) {
            SimbolosTabela.TipoDadoLA temp = determinarTipo(escopos, t);
            if (tipo == null) {
                tipo = temp;
            } else {
                // permite misturar inteiro e real -> resultado real
                if ((tipo == SimbolosTabela.TipoDadoLA.INTEIRO && temp == SimbolosTabela.TipoDadoLA.REAL)
                 || (tipo == SimbolosTabela.TipoDadoLA.REAL    && temp == SimbolosTabela.TipoDadoLA.INTEIRO)) {
                    tipo = SimbolosTabela.TipoDadoLA.REAL;
                }
                // se ainda forem tipos diferentes (e não inválido), marca inválido
                else if (temp != tipo && temp != SimbolosTabela.TipoDadoLA.INVALIDO) {
                    tipo = SimbolosTabela.TipoDadoLA.INVALIDO;
                }
            }
        }
        return tipo != null ? tipo : SimbolosTabela.TipoDadoLA.INVALIDO;
    }
    
    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.TermoContext ctx) {
        SimbolosTabela.TipoDadoLA tipo = null;
        for (MeuParser.FatorContext f : ctx.fator()) {
            SimbolosTabela.TipoDadoLA temp = determinarTipo(escopos, f);
            if (tipo == null) {
                tipo = temp;
            } else {
                // permite misturar inteiro e real -> resultado real
                if ((tipo == SimbolosTabela.TipoDadoLA.INTEIRO && temp == SimbolosTabela.TipoDadoLA.REAL)
                 || (tipo == SimbolosTabela.TipoDadoLA.REAL    && temp == SimbolosTabela.TipoDadoLA.INTEIRO)) {
                    tipo = SimbolosTabela.TipoDadoLA.REAL;
                }
                // se ainda forem tipos diferentes (e não inválido), marca inválido
                else if (temp != tipo && temp != SimbolosTabela.TipoDadoLA.INVALIDO) {
                    tipo = SimbolosTabela.TipoDadoLA.INVALIDO;
                }
            }
        }
        return tipo != null ? tipo : SimbolosTabela.TipoDadoLA.INVALIDO;
    }
    

    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.FatorContext ctx) {
        return determinarTipo(escopos, ctx.parcela(0));
    }

    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.ParcelaContext ctx) {
        if (ctx.parcela_unario() != null) {
            return determinarTipo(escopos, ctx.parcela_unario());
        }
        return determinarTipo(escopos, ctx.parcela_nao_unario());
    }

    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.Parcela_nao_unarioContext ctx) {
        if (ctx.CADEIA() != null) return SimbolosTabela.TipoDadoLA.CADEIA;
        if (ctx.identificador() != null) return determinarTipo(escopos, ctx.identificador());
        return SimbolosTabela.TipoDadoLA.INVALIDO;
    }

    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.Parcela_unarioContext ctx) {
        if (ctx.NUM_INT() != null) {
            return SimbolosTabela.TipoDadoLA.INTEIRO;
        }
        if (ctx.NUM_REAL() != null) {
            return SimbolosTabela.TipoDadoLA.REAL;
        }
        if (ctx.identificador() != null) {
            return determinarTipo(escopos, ctx.identificador());
        }
        return SimbolosTabela.TipoDadoLA.INVALIDO;
    }
    
    
    

public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.IdentificadorContext ctx) {
    String nome = ctx.IDENT().stream()
        .map(TerminalNode::getText)
        .collect(Collectors.joining("."));

    for (SimbolosTabela esc : escopos.listarContextosAninhados()) {
        if (esc.contem(nome)) {
            return esc.consultarTipoDado(nome);
        }
    }

    return SimbolosTabela.TipoDadoLA.INVALIDO;
}


    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.ExpressaoContext ctx) {
        SimbolosTabela.TipoDadoLA tipo = null;
        for (MeuParser.Termo_logicoContext tl : ctx.termo_logico()) {
            SimbolosTabela.TipoDadoLA temp = determinarTipo(escopos, tl);
            if (tipo == null) tipo = temp;
            else if (temp != tipo && temp != SimbolosTabela.TipoDadoLA.INVALIDO) tipo = SimbolosTabela.TipoDadoLA.INVALIDO;
        }
        return tipo != null ? tipo : SimbolosTabela.TipoDadoLA.INVALIDO;
    }

    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.Termo_logicoContext ctx) {
        SimbolosTabela.TipoDadoLA tipo = null;
        for (MeuParser.Fator_logicoContext fl : ctx.fator_logico()) {
            SimbolosTabela.TipoDadoLA temp = determinarTipo(escopos, fl);
            if (tipo == null) tipo = temp;
            else if (temp != tipo && temp != SimbolosTabela.TipoDadoLA.INVALIDO) tipo = SimbolosTabela.TipoDadoLA.INVALIDO;
        }
        return tipo != null ? tipo : SimbolosTabela.TipoDadoLA.INVALIDO;
    }

    public static SimbolosTabela.TipoDadoLA determinarTipo(Contexto escopos, MeuParser.Fator_logicoContext ctx) {
        if (ctx.parcela_logica().exp_relacional() != null) {
            return determinarTipo(escopos, ctx.parcela_logica().exp_relacional());
        }
        return SimbolosTabela.TipoDadoLA.LOGICO;
    }
    public static SimbolosTabela.TipoDadoLA getTipo(String textoTipo) {
        switch (textoTipo.replace("^", "")) {
            case "inteiro": return SimbolosTabela.TipoDadoLA.INTEIRO;
            case "real": return SimbolosTabela.TipoDadoLA.REAL;
            case "literal": return SimbolosTabela.TipoDadoLA.CADEIA;
            case "logico": return SimbolosTabela.TipoDadoLA.LOGICO;
            default: return SimbolosTabela.TipoDadoLA.INVALIDO;
        }
    }
    public static String getCType(TipoDadoLA tipo) {
        switch (tipo) {
            case INTEIRO: return "int";
            case REAL:    return "float";
            case CADEIA:  return "char";
            case LOGICO:  return "int";
            default:      return "void";
        }
    }
public static String getCType(String textoTipo) {
    // primeiro converte a String para o enum
    TipoDadoLA tipoEnum = getTipo(textoTipo);
    // depois retorna o C type
    return getCType(tipoEnum);
}

public static String getCTypeSymbol(TipoDadoLA tipo) {
    switch (tipo) {
        case INTEIRO: return "d";
        case REAL:    return "f";
        case CADEIA:  return "s";
        case LOGICO:  return "d";
        default:      return "";
    }
}

}

