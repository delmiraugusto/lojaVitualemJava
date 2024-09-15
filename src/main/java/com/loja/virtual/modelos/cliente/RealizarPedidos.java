package com.loja.virtual.modelos.cliente;

import static com.loja.virtual.modelos.produto.Produto.produtos;

public class RealizarPedidos {
    public static void realizarPedidos() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.printf("%d - %s -> %f %n",
                    produtos.get(i).getCodProduto(),
                    produtos.get(i).getNomeProduto(),
                    produtos.get(i).getValorUnitario()
            );
        }
    }
}
