package com.loja.virtual.modelos.cliente;

import java.util.Scanner;

import static com.loja.virtual.modelos.cliente.Cliente.clientes;

public class CadastrarCliente {
    public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        Cliente cli = new Cliente();
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        cli.setLogin(nome);
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        cli.setEmail(email);
        System.out.println("Crie uma senha: ");
        String senha = scanner.nextLine();
        cli.setSenha(senha);
        clientes.add(cli);
        System.out.println("Cliente Adicionado com Sucesso");
    }
}
