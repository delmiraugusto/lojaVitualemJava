package com.loja.virtual.modelos.cliente;

import java.util.Scanner;

import static com.loja.virtual.modelos.cliente.Cliente.clientes;

public class CadastrarCliente {
    public static void cadastrarCliente() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.println("Crie uma senha: ");
        String senha = scanner.nextLine();

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setLogin(email);
        cliente.setSenha(senha);
        clientes.add(cliente);
    }

    }
