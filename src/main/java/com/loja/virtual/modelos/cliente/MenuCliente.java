package com.loja.virtual.modelos.cliente;

import java.util.Scanner;

import static com.loja.virtual.modelos.cliente.ConsultaPedidos.consultarPedidos;
import static com.loja.virtual.modelos.cliente.RealizarPedidos.realizarPedidos;

public class MenuCliente {
    public static void menuCliente() {
        Scanner mCliente = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("""
        ====================================
        |         MENU PRINCIPAL           |
        ====================================
        | 1 - Comprar                      |
        | 2 - Consultar Pedidos            |
        | 0 - Sair                         |
        ====================================
        Escolha uma opção:
        """);
            opc = mCliente.nextInt();
            switch (opc){
                case 1 -> realizarPedidos();
                case 2 -> consultarPedidos();
                case 0 -> System.out.println("Saindo");
            }
        }while(opc!=0);
    }
}