package br.ufscar.dc.compiladores.meu.lexico;

import java.util.LinkedList;
import java.util.List;

public class Contexto {

    private LinkedList<SimbolosTabela> pilhaDeContextos;

    // Construtor que inicializa o contexto e define a pilha usando LinkedList
    public Contexto() {
        pilhaDeContextos = new LinkedList<>();
        iniciarNovoContexto();
    }

    public void iniciarNovoContexto() {
        pilhaDeContextos.push(new SimbolosTabela());
    }

    // Retorna o contexto atual sem removê-lo da pilha
    public SimbolosTabela obterContextoAtual() {
        return pilhaDeContextos.peek();
    }

    public List<SimbolosTabela> listarContextosAninhados() {
        return pilhaDeContextos;
    }

    public void sairDoContexto() {
        pilhaDeContextos.pop();
    }
}
