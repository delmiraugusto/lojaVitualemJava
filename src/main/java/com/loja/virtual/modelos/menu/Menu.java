package com.loja.virtual.modelos.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.loja.virtual.modelos.gestor.Gestor;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
    }

    public static void menu_principal() {
        int opcao =-1;
        do {
            try {
                System.out.println("""
        =================================
        |         MENU PRINCIPAL        |
        =================================
        | 1 - Administrativo            |
        | 2 - Compras                   |
        | 0 - Sair                      |
        =================================
        Escolha uma opção:

        """);

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        exibirMenuAdministrativo();
                        break;
                    case 2:
                        exibirMenuCompras();
                        break;
                    case 0:
                        System.out.println("Obrigado... Volte sempre!");
                        break;
                    default:
                        System.out.println("Número inválido! Digite um número entre 0 e 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
                scanner.next();
            }
        } while (opcao != 0);
    }

private static void exibirMenuAdministrativo() {
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
                    case 1:
                    cadastrarProdutos();
                    break;
                case 2:
                    consultarPedidos();
                    break;
                case 3:
                    produtosMaisVendidos();
                    break;
                case 4:
                    clienteQueMaisComprou();
                    break;
                case 5:
                    totalPedidos();
                    break;
                case 0:
                    menu_principal();
                    break;
                default:
                System.out.println("Número inválido! Digite um número entre 0 e 2.");
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



    private static void exibirMenuCompras() {
        System.out.println("Digite o seu login:");
        String usuario = scanner.nextLine();
        System.out.println("Digite a sua senha:");
        String senha = scanner.nextLine();


        //Tentando buscar na classe Cliente a validação do usuario

    /*   if (Cliente.validarLogin(usuario, senha)) {
            System.out.println("Bem-vindo, " + usuario + "!");
        } else {
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
        }*/

        // Criar o menu do cliente
    }
}


