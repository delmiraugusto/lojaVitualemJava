package com.loja.virtual.Login;

import com.loja.virtual.enumeradores.Role;

import java.util.List;

public class LoginController {
    public Role login(String usuario, String senha, List<Login> usuarios) {
        for (Login user : usuarios) {
            if(user.acessoPermitido(usuario, senha)) {
                return user.getRole();
            }
        }
        return null;
    }
}
