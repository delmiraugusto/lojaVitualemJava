package com.loja.virtual.modelos.menu;

import com.loja.virtual.Login.Login;
import com.loja.virtual.Login.LoginController;
import com.loja.virtual.enumeradores.Role;
import com.loja.virtual.modelos.cliente.Cliente;
import com.loja.virtual.modelos.gestor.Gestor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.loja.virtual.modelos.cliente.MenuCliente.menuCliente;


public class TelaInicial {
    public static void loginVerification() {
        Scanner scEntrada = new Scanner(System.in);

        List<Login> usuarios = new ArrayList<>();
        usuarios.addAll(Cliente.clientes);
        usuarios.addAll(Gestor.gestores);

        Gestor gestor = new Gestor();
        gestor.setEmail("admin@");
        gestor.setSenha("123");

        int option = scEntrada.nextInt();
        do{
            System.out.println("""
        ====================================
        |         MENU PRINCIPAL           |
        ====================================
        | 1 - Login                        |
        (Caso já possua conta)             |
        | 2 - Cadastrar                    |
        (Cadastrar um conta)               |
        | 0 - Sair                         |
        ====================================
        Escolha uma opção:

        """);
            switch (option){
                case 1 -> {
                    System.out.println("Digite seu login:");
                    String user = scEntrada.nextLine();

                    System.out.println("Digite sua senha:");
                    String pass = scEntrada.nextLine();

                    LoginController loginController = new LoginController();
                    Role role = loginController.login(user, pass, usuarios);

                    if(role == Role.GESTOR) {
                        exibirMenuAdministrativo();
                    }
                    if(role == Role.CLIENTE){
                        menuCliente();
                    }
                }
                case 2 -> System.out.println("Cadastar conta");
            }
        }while(option != 0);
    }
}
