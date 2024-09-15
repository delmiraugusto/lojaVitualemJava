package com.loja.virtual.modelos.gestor;

import com.loja.virtual.modelos.usuario.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gestor extends Usuario {

    private int codFuncionario;
    private String setor;
    private String senha;

    public Gestor(String nome, String email, String senha, int codFuncionario, String setor) {
        super(nome, email);
        this.senha = senha;
        this.codFuncionario = codFuncionario;
        this.setor = setor;
    }


    public boolean validarLogin(String usuario, String senha) {
        return this.getNome().equals(usuario) && this.senha.equals(senha);
    }
}
