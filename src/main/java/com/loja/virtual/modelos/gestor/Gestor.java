package com.loja.virtual.modelos.gestor;

import com.loja.virtual.enumeradores.Role;
import com.loja.virtual.modelos.cliente.Cliente;
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
public class Gestor extends Usuario {
    private int codFuncionario;
    private String setor;
    private Role role = Role.GESTOR;
    public static List<Gestor> gestores = new ArrayList<>();

    public boolean validarLogin(String usuario, String senha) {
        return this.getNome().equals(usuario) && this.getSenha().equals(senha);
    }
}
