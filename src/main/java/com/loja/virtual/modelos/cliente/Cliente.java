package com.loja.virtual.modelos.cliente;

import com.loja.virtual.modelos.usuario.Usuario;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Cliente extends Usuario {
    private String endereco;
    private int pontosFidelidade;
    private int codFuncionario;
    private String senha;

    public Cliente(String nome, String email, String endereco, int pontosFidelidade) {
        super(nome, email);
        this.endereco = endereco;
        this.pontosFidelidade = pontosFidelidade;
        this.senha = senha;
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

    public boolean validarLogin(String usuario, String senha) {
        return this.getNome().equals(usuario) && this.senha.equals(senha);
    }

    }


