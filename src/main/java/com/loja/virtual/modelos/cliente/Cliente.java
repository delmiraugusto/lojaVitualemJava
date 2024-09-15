package com.loja.virtual.modelos.cliente;

import com.loja.virtual.enumeradores.Role;
import com.loja.virtual.modelos.usuario.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Usuario {
    private String endereco;
    private int pontosFidelidade;
    private int codFuncionario;
    private String senha;
    private Role role = Role.CLIENTE;
    public static List<Cliente> clientes = new ArrayList<>();

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


