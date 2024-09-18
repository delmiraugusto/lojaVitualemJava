package com.loja.virtual.modelos.gestor;

import com.loja.virtual.modelos.pedido.Pedido;
import com.loja.virtual.modelos.produto.ProdutoPedido;

import java.util.ArrayList;
import java.util.List;

import static com.loja.virtual.modelos.pedido.Pedido.*;

public class TotalPedidos {
    public static void totalPedidos(String user) {
        int contador = 0;
        double total = 0;
        for (Pedido pedido : todosPedidos) {
            contador++;
            System.out.printf("""
                    Nome : %s
                    Data do Pedido: %s
                    """,pedido.getCliente().getNome(),
                    pedido.getDataPedido());
            for (ProdutoPedido produto : pedidosFinalizados){
                System.out.printf("""
                        %s - %s -> %f
                        
                        """,produto.getProduto().getCodProduto(),
                        produto.getProduto().getNomeProduto(),
                        produto.getProduto().getValorUnitario());
                total += produto.getProduto().getValorUnitario();
            }
            System.out.println("Total: " + total + "\n");
        }

        System.out.println("Total de pedidos: " + contador);
    }
}
