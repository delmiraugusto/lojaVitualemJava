package com.loja.virtual.modelos.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.loja.virtual.modelos.gestor.Gestor;

public class MenuGestor {
    public static void menuGestor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o usuário do Gestor:");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha do Gestor:");
        String senha = scanner.nextLine();

        //Tentando buscar na classe Gestor a validação do usuario
/*      if (Gestor.validarLogin(usuario, senha)) {
            System.out.println("Login realizado com sucesso! Bem-vindo, " + usuario + "!");

        int opcao =-1;
        do {
            try {
                System.out.println("""
        =========================================
        |          MENU ADMINISTRATIVO          |
        =========================================
        | 1 - Cadastrar Produto                 |
        | 2 - Produtos Mais Vendidos            |
        | 3 - Cliente Que Mais Comprou          |
        | 4 - Total de Pedidos                  |
        | 0 - Voltar                            |
        =========================================
        Escolha uma opção:

                        """);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarProdutos();
                case 2 -> produtosMaisVendidos();
                case 3 -> clienteQueMaisComprou();
                case 4 -> totalPedidos();
                case 0 -> menu_principal();
                default -> System.out.println("Número inválido! Digite um número entre 0 e 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                scanner.next();
            }
        } while (opcao != 0);
    }else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
            }*/
    }


//    private static void exibirMenuCompras() {
//        System.out.println("Digite o seu login:");
//        String usuario = scanner.nextLine();
//        System.out.println("Digite a sua senha:");
//        String senha = scanner.nextLine();
//
//
//        //Tentando buscar na classe Cliente a validação do usuario
//
//    /*   if (Cliente.validarLogin(usuario, senha)) {
//            System.out.println("Bem-vindo, " + usuario + "!");
//        } else {
//            System.out.println("Usuário ou senha incorretos. Tente novamente.");
//        }*/
//
//        // Criar o menu do cliente
//    }
}







