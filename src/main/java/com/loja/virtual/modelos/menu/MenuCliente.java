package com.loja.virtual.modelos.menu;

import java.util.List;
import java.util.Scanner;


import static com.loja.virtual.modelos.produto.RemoverProdutoCarrinho.removerProdutoCarrinho;
import static com.loja.virtual.modelos.cliente.ConsultaPedidos.consultarPedidos;
import static com.loja.virtual.modelos.cliente.RealizarPedidos.realizarPedidos;


public class MenuCliente {
    public static void menuCliente(String user) {
        Scanner mCliente = new Scanner(System.in);
        int opc;
        double total = 0; // Adicionei essa variável para ser passada como argumento

        do {

            System.out.printf("""

        ====================================
        |              Loja                |
        ====================================
                   usuario: %s
        | 1 - Comprar                      |
        | 2 - Consultar Pedidos            |
        | 3 - Remover Produto              |
        | 0 - Sair                         |
        ====================================
        Escolha uma opção:

        """, user);
            opc = mCliente.nextInt();

            switch (opc) {
                case 1 -> realizarPedidos(user);
                case 2 -> consultarPedidos(user);
                case 3 -> {
                    System.out.println("Digite o código do produto que deseja remover: ");
                    int codProduto = mCliente.nextInt();
                    removerProdutoCarrinho ( user, codProduto);
                }
                case 0 -> System.out.println("Saindo");
            }
        } while (opc != 0);

    }


}
