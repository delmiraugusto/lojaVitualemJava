package com.loja.virtual.modelos.usuario;

import com.loja.virtual.Login.Login;
import com.loja.virtual.enumeradores.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String nome;
    private String email;
    private String senha;

@Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Senha: " + senha;
    }
}