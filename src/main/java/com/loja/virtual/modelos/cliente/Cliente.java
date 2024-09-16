package com.loja.virtual.modelos.cliente;

import com.loja.virtual.Login.Login;
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
public class Cliente extends Usuario implements Login {
    //private String endereco;
    //private int pontosFidelidade;
    //private int codFuncionario;
    //private String senha;
    private Role role = Role.CLIENTE;
    private String login;
    private String senha;
    public static List<Cliente> clientes = new ArrayList<>();

    @Override
    public boolean acessoPermitido(String login, String senha) {
        return login.equals(this.getLogin()) && senha.equals(this.getSenha());
    }

    @Override
    public Role getRole() {
        return role;
    }


//    public void adicionarPontos(int pontos){
//        this.pontosFidelidade += pontos;
//    }
//
//    public boolean usarPontos(int pontos) {
//        if(pontos <= pontosFidelidade) {
//            this.pontosFidelidade -= pontos;
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public String toString() {
//        return super.toString() + ", Endereco: " + endereco + ", Pontos de Fidelidade: " + pontosFidelidade;
//    }
//
//    public boolean validarLogin(String usuario, String senha) {
//        return this.getNome().equals(usuario) && this.senha.equals(senha);
//    }

}


