package br.ufscar.dc.compiladores.meu.lexico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.Categoria;
import br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.EntradaSimbolo;
import br.ufscar.dc.compiladores.meu.lexico.SimbolosTabela.TipoDadoLA;

public class SimbolosTabela {

    public enum TipoDadoLA {
        INTEIRO,
        REAL,
        CADEIA,
        LOGICO,
        TIPO,
        INVALIDO
    }

    public enum Categoria {
        VAR,
        CONST,
        TYPE,
        PROC,
        FUNC,
        POINTER,
        RECORD,
        ENUM,
        PARAM

    }

    public static class RegistroSimbolo {
        public Categoria categoria;    // categoria do símbolo
        public String tipoNome;        // nome do tipo: "inteiro", "^real", "MeuRegistro", etc.
        public List<TipoDadoLA> params; // lista de tipos formais (para PROC/FUNC)

        public RegistroSimbolo(Categoria categoria, String tipoNome, List<TipoDadoLA> params) {
            this.categoria = categoria;
            this.tipoNome = tipoNome;
            this.params = params;
        }
    }

    public static class EntradaSimbolo {
    public String nome;
    public SimbolosTabela.Categoria categoria;
    public String tipo;
    public List<SimbolosTabela.TipoDadoLA> parametros;
    public Map<String, EntradaSimbolo> campos; // para registro

    public EntradaSimbolo(String nome, Categoria categoria, String tipo, List<TipoDadoLA> parametros) {
        this.nome = nome;
        this.categoria = categoria;
        this.tipo = tipo;
        this.parametros = parametros != null ? parametros : new ArrayList<>();
        this.campos = new HashMap<>();
    }
}

public List<TipoDadoLA> obterParametros(String nomeFuncao) {
    RegistroSimbolo simbolo = mapaSimbolos.get(nomeFuncao);
    if (simbolo != null && simbolo.params != null) {
        return simbolo.params;
    }
    return new ArrayList<>();
}

    private final Map<String, RegistroSimbolo> mapaSimbolos;

    public SimbolosTabela() {
        this.mapaSimbolos = new HashMap<>();
    }

    /**
     * Insere um símbolo na tabela.
     *
     * @param identificador nome do símbolo
     * @param categoria     categoria do símbolo (VAR, CONST, TYPE, PROC, FUNC, POINTER, RECORD)
     * @param tipoNome      nome do tipo associado ("inteiro", "^real", nome de registro, etc.)
     * @param params        lista de tipos de parâmetros (null ou vazia se não aplicável)
     */
    public void inserir(String identificador, Categoria categoria, String tipoNome, List<TipoDadoLA> params) {
        mapaSimbolos.put(identificador, new RegistroSimbolo(categoria, tipoNome, params));
    }

    /** Verifica se a tabela contém o identificador no escopo atual. */
    public boolean contem(String identificador) {
        return mapaSimbolos.containsKey(identificador);
    }

    /**
     * Retorna o registro completo associado ao identificador,
     * ou null se não existir.
     */
    public RegistroSimbolo consultarRegistro(String identificador) {
        return mapaSimbolos.get(identificador);
    }

    /**
     * Retorna apenas o TipoDadoLA básico de um identificador,
     * mapeando seu tipoNome para INTEIRO, REAL, CADEIA, LOGICO ou INVALIDO.
     */
    public TipoDadoLA consultarTipoDado(String identificador) {
        RegistroSimbolo reg = mapaSimbolos.get(identificador);
        return (reg != null) ? mapTipoNomeToTipoDado(reg.tipoNome) : TipoDadoLA.INVALIDO;
    }

    // Auxiliar para converter tipoNome em TipoDadoLA
    private TipoDadoLA mapTipoNomeToTipoDado(String tipoNome) {
        switch (tipoNome) {
            case "inteiro": return TipoDadoLA.INTEIRO;
            case "real":    return TipoDadoLA.REAL;
            case "literal": return TipoDadoLA.CADEIA;
            case "logico":  return TipoDadoLA.LOGICO;
            default:         return TipoDadoLA.INVALIDO;
        }
    }
    public RegistroSimbolo buscar(String nome) {
        return mapaSimbolos.get(nome);
    }
    
    
    
    
    
    
}