package com.loja.virtual.modelos.produto;

import com.loja.virtual.modelos.pedido.Pedido;

import static com.loja.virtual.modelos.pedido.Pedido.carrinho;
import static com.loja.virtual.modelos.produto.Produto.produtos;

public class FinalizarCompra {
    public static void finalizarCompra() {

        double total = 0;

        if (carrinho.isEmpty()) {
            System.out.println("carrinho vazio! Compra não realizada");
            return;
        }

    for(int k = 0; k < carrinho.size(); k++) {
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
                        .get(k).
                        getProduto().
                        getValorUnitario(),
                carrinho
                        .get(k)
                        .getQuantidade()
        );
        for (int index = 0; index < produtos.size(); index++) {
            if(
            carrinho
            .get(k)
            .getProduto()
            .getNomeProduto() == produtos.get(index).getNomeProduto()
            )
            {
                produtos
                .get(index)
                .setQuantidadeEstoque
                            (
                                produtos
                                .get(index)
                                .getQuantidadeEstoque()-1
                            );
            }
        }
        total += carrinho.
                get(k).
                getProduto().
                getValorUnitario();
    }
    System.out.println("\nTotal: \n"+total);
    Pedido.finalizarCompra();
    System.out.println("Compra finalizada com sucesso!");
//    for (int index = 0; index < carrinho.size(); index++) {
//            carrinho.removeAll(carrinho);
//        }

    }
}



