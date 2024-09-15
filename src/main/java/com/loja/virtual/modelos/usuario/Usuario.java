package com.loja.virtual.modelos.usuario;

import java.util.Date;


public class Usuario {
    private static String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    public static String getNome() {
        return nome;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

public String toString() {
    return "Nome: " + nome + ", Email: " + email;
}
    }