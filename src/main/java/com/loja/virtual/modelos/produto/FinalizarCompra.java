package com.loja.virtual.modelos.produto;

import com.loja.virtual.modelos.pedido.Pedido;

import java.util.Objects;

import static com.loja.virtual.modelos.pedido.Pedido.carrinho;
import static com.loja.virtual.modelos.produto.Produto.produtos;

public class FinalizarCompra {
    public static void finalizarCompra() {
        double total = 0;
        if (carrinho.isEmpty()) {
            System.out.println("carrinho vazio! Compra não realizada");
        }else {
//            for (int k = 0; k < carrinho.size(); k++) {
//                System.out.printf("""
//                                %d - %s -> %.2f quant.: %d
//                                """,
//                        carrinho
//                                .get(k)
//                                .getProduto()
//                                .getCodProduto(),
//                        carrinho
//                                .get(k)
//                                .getProduto()
//                                .getNomeProduto(),
//                        carrinho
//                                .get(k).
//                                getProduto().
//                                getValorUnitario(),
//                        carrinho
//                                .get(k)
//                                .getQuantidade()
//                );
//                for (Produto produto : produtos) {
//                    if (
//                            Objects.equals(carrinho
//                                    .get(k)
//                                    .getProduto()
//                                    .getNomeProduto(), produto.getNomeProduto())
//                    ) {
//                        produto
//                                .setQuantidadeEstoque
//                                        (
//                                                produto
//                                                        .getQuantidadeEstoque() - 1
//                                        );
//                    }
//                }
//                total += carrinho.
//                        get(k).
//                        getProduto().
//                        getValorUnitario();
//            }
            Pedido.finalizarCompra();
            System.out.println("Compra finalizada com sucesso!");
//            for (ProdutoPedido pp : Pedido.pedidosFinalizados) {
//                total += pp.getProduto().getValorUnitario() * pp.getQuantidade();
//            }
//            System.out.println("Total: " + total);
        }

//        System.out.println("\nTotal: \n"+total);
//        System.out.println("Compra finalizada com sucesso!");
    //    for (int index = 0; index < carrinho.size(); index++) {
    //            carrinho.removeAll(carrinho);
    //        }

    }
}



