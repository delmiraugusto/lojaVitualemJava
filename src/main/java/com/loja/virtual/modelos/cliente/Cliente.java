package com.loja.virtual.modelos.cliente;

import java.util.ArrayList;
import java.util.List;

import com.loja.virtual.Login.Login;
import com.loja.virtual.enumeradores.Role;
import com.loja.virtual.modelos.usuario.Usuario;

import lombok.Data;


@Data
public class Cliente extends Usuario implements Login {
    //private String endereco;
    //private int pontosFidelidade;
    //private int codFuncionario;
    //private String senha;
    private Role role = Role.CLIENTE;
    private String login;
    private String senha;
    public static List<Cliente> clientes = new ArrayList<>();

//    public Cliente(String nome, String email, String senha, String endereco, int pontosFidelidade, int codFuncionario) {
//        super(nome, email, senha);
//        this.endereco = endereco;
//        this.pontosFidelidade = pontosFidelidade;
//        this.codFuncionario = codFuncionario;
//    }
//
//    public Cliente(){
//    }
//
//    public void adicionarPontos(int pontos) {
//        this.pontosFidelidade += pontos;
//    }
//
//    public boolean usarPontos(int pontos) {
//        if (pontos <= pontosFidelidade) {
//            this.pontosFidelidade -= pontos;
//            return true;
//        } else {
//            return false;
//        }
//    }

    @Override
    public boolean acessoPermitido(String login, String senha) {
        return login.equals(this.getLogin()) && senha.equals(this.getSenha());
    }

    @Override
    public Role getRole() {
        return role;
    }
    
//    @Override
//    public String toString() {
//        return super.toString() + ", Endereço: " + endereco + ", Pontos de Fidelidade: " + pontosFidelidade;
//    }

    public boolean validarLogin(String usuario, String senha) {
        return this.getNome().equals(usuario) && this.getSenha().equals(senha);
    }
}


