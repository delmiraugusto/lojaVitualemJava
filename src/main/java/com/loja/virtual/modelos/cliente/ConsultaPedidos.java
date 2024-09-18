package com.loja.virtual.modelos.cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.loja.virtual.modelos.pedido.Pedido.carrinho;
import static com.loja.virtual.modelos.pedido.Pedido.todosPedidos;

import com.loja.virtual.modelos.pedido.Pedido;
import com.loja.virtual.modelos.produto.ProdutoPedido;

public class ConsultaPedidos {
    public static void consultarPedidos(String user) {
        double total = 0;
        System.out.println("Listando todos os pedidos:");
        for (Pedido pedido : todosPedidos) {
            if (Objects.equals(pedido.getCliente().getLogin(), user)) {
                System.out.println(pedido.getCodPedido());
                System.out.println(pedido.getDataPedido());
                System.out.println(pedido.getCliente().getNome());
            }
            break;
        }
        for (int k = 0; k < carrinho.size(); k++) {
            System.out.printf("""
                    %d - %s -> %.2f quant.: %d
                    """,
                    carrinho
                            .get(k)
                            .getProduto()
                            .getCodProduto(),
                    carrinho
                            .get(k)
                            .getProduto()
                            .getNomeProduto(),
                    carrinho
                            .get(k).getProduto().getValorUnitario(),
                    carrinho
                            .get(k)
                            .getQuantidade());
            total += carrinho.get(k).getProduto().getValorUnitario();
        }
        System.out.println("Total:" + total);
    }
}
