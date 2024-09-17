package com.loja.virtual.modelos.cliente;

import static com.loja.virtual.modelos.cliente.Cliente.clientes;

public class ClienteInstance {
    public static void clienteInstance() {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Rafael");
        cliente1.setLogin("rafa");
        cliente1.setSenha("123");
        clientes.add(cliente1);
    }
}
