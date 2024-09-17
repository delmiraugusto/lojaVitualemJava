package com.loja.virtual.modelos.menu;

import java.util.Scanner;

import static com.loja.virtual.modelos.cliente.ConsultaPedidos.consultarPedidos;
import static com.loja.virtual.modelos.cliente.RealizarPedidos.realizarPedidos;

public class MenuCliente {
    public static void menuCliente(String user) {
        Scanner mCliente = new Scanner(System.in);
        int opc;
        do{
            System.out.printf("""
        
        ====================================
        |              Loja                |
        ====================================
                  usuario: %s
        | 1 - Comprar                      |
        | 2 - Consultar Pedidos            |
        | 0 - Sair                         |
        ====================================
        Escolha uma opção:
        
        """, user);
            opc = mCliente.nextInt();
            switch (opc){
                case 1 -> realizarPedidos(user);
                case 2 -> consultarPedidos();
                case 3 -> removerProduto();
                case 0 -> System.out.println("Saindo");
            }
        }while(opc!=0);
    }
}