package com.loja.virtual.modelos.gestor;



import java.util.List;

import com.loja.virtual.modelos.produto.Produto;

public class RemoverProduto {
//para remover produtos

    public static void removerProduto(String user, int codProduto, double total) {
        Produto produtoRemover = null;

        for (Produto produto : Produto.produtos) {
            if (produto.getCodProduto() == codProduto) {
                produtoRemover = produto;
                break;
            }
        }


        if (produtoRemover != null) {
            Produto.produtos.remove(produtoRemover);
            System.out.println("Produto removido: " + produtoRemover.getNomeProduto());
            //carrinho.remove(pp);
        } else {
            System.out.println("Erro: Produto não encontrado com o código fornecido.");
        }
    }
}
