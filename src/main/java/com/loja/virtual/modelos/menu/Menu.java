package com.loja.virtual.modelos.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
    }

    public static void menu_principal() {
        int opcao;
        do {
            try {
                System.out.println("\n--- MENU PRINCIPAL ---");
                System.out.println("1- Administrativo");
                System.out.println("2- Compras");
                System.out.println("0- Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        menuGestor();
                        break;
                    case 2:
                        menuCliente();
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


    public static void main(String[] args) {
        menu_principal();
    }
}
