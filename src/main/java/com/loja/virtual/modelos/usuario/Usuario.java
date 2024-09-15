package com.loja.virtual.modelos.usuario;

import com.loja.virtual.Login.Login;
import com.loja.virtual.enumeradores.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario  implements Login {
    private String nome;
    private String login;
    private String senha;

    @Override
    public boolean acessoPermitido(String login, String senha) {
        return false;
    }

    @Override
    public Role getRole() {
        return null;
    }
}