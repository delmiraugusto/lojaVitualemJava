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

    public Cliente(String nome, String email, String senha, String endereco, int pontosFidelidade, int codFuncionario) {
        super(nome, email, senha);
        this.endereco = endereco;
        this.pontosFidelidade = pontosFidelidade;
        this.codFuncionario = codFuncionario;
    }

    public void adicionarPontos(int pontos) {
        this.pontosFidelidade += pontos;
    }

    public boolean usarPontos(int pontos) {
        if (pontos <= pontosFidelidade) {
            this.pontosFidelidade -= pontos;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Endereço: " + endereco + ", Pontos de Fidelidade: " + pontosFidelidade;
    }

    public boolean validarLogin(String usuario, String senha) {
        return this.getNome().equals(usuario) && this.getSenha().equals(senha);
    }

    }


