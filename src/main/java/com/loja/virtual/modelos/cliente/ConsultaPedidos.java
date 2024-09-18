package com.loja.virtual.modelos.cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.loja.virtual.modelos.pedido.Pedido;
import com.loja.virtual.modelos.produto.ProdutoPedido;

import static com.loja.virtual.modelos.pedido.Pedido.*;
import static com.loja.virtual.modelos.pedido.Pedido.pedidosFinalizados;

public class ConsultaPedidos {
    public static void consultarPedidos(String user) {
        double totalTotal = 0.0;
        for (ProdutoPedido produtoPedidoC : pedidosFinalizados) {
            if(produtoPedidoC.getPedido().getCliente().getLogin().equals(user)) {
                System.out.printf("""
                                
                                Nome : %s
                                Data do Pedido: %s
                                """,
                        produtoPedidoC.getPedido().getCliente().getNome(),
                        produtoPedidoC.getPedido().getDataPedido()
                );
                for (ProdutoPedido produtoPedidoP : pedidosFinalizados) {
                    System.out.printf("""
                                    %s - %s -> %.2f
                                    """,
                            produtoPedidoP.getProduto().getCodProduto(),
                            produtoPedidoP.getProduto().getNomeProduto(),
                            produtoPedidoP.getProduto().getValorUnitario());
                    totalTotal += produtoPedidoP.getProduto().getValorUnitario();
                }
            }else{
                System.out.println("Nenhum Pedido ainda");
            }
        }
        System.out.println("Total: " + totalTotal);
    }
}
