package com.loja.virtual.modelos.cliente;

import java.util.ArrayList;
import java.util.List;

public class ConsultaPedidos {
    
    private static List<String> pedidos;

    static {
        pedidos = new ArrayList<>();
        pedidos.add("Pedido 1: Cliente Rafael - R$ 200.50");
        pedidos.add("Pedido 2: Cliente Demir - R$ 350.00");
        pedidos.add("Pedido 3: Cliente Gabriella - R$ 150.75");
    }

    public static void consultarPedidos() {
        System.out.println("Listando todos os pedidos:");
        for (String pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
