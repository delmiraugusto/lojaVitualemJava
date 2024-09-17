package com.loja.virtual.modelos.menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import static com.loja.virtual.modelos.gestor.CadastrarProdutos.cadastrarProdutos;
import static com.loja.virtual.modelos.menu.LoginVerification.loginVerification;

public class MenuGestor {
    public static void menuGestor() {
        Scanner sc = new Scanner(System.in);

        // Tentando buscar na classe Gestor a validação do usuario

        int opcao = 1;
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

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarProdutos();
                case 2 -> produtosMaisVendidos();
                case 3 -> clienteQueMaisComprou();
                case 4 -> totalPedidos();
                case 0 -> loginVerification();
                default -> System.out.println("Número inválido! Digite uma opção válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                sc.next();
            }
        } while (opcao != 0);
    }
}