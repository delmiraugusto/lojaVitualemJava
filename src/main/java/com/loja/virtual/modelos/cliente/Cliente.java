package com.loja.virtual.modelos.cliente;

import com.loja.virtual.modelos.usuario.Usuario;

public class Cliente extends Usuario {
    private String endereco;
    private int pontosFidelidade;

    public Cliente(String nome, String email, String endereco, int pontosFidelidade) {
        super(nome, email);
        this.endereco = endereco;
        this.pontosFidelidade = pontosFidelidade;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public int getPontosFidelidade() {
        return pontosFidelidade;
    }
    public void setPontosFidelidade(int pontosFidelidade) {
        this.pontosFidelidade = pontosFidelidade;
    }

    public void adicionarPontos(int pontos){
        this.pontosFidelidade += pontos;
    }

    public boolean usarPontos(int pontos) {
        if(pontos <= pontosFidelidade) {
            this.pontosFidelidade -= pontos;
            return true;
        } else {
            return false; 
        }
    }
    public String toString() {
        return super.toString() + ", Endereco: " + endereco + ", Pontos de Fidelidade: " + pontosFidelidade;
    }
    }
