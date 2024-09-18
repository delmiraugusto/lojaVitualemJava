package com.loja.virtual.modelos.produto;

import com.loja.virtual.modelos.pedido.Pedido;
import static com.loja.virtual.modelos.pedido.Pedido.carrinho;

public class RemoverProdutoCarrinho {

    public static void removerProdutoCarrinho(String user, int codProduto) {
        boolean produtoRemovido = false;

        for (int index = 0; index < carrinho.size(); index++) {
            // Verifica se o código do produto no carrinho corresponde ao código fornecido
            if (carrinho.get(index).getProduto().getCodProduto() == codProduto) {
                // Remove o produto do carrinho pelo índice
                carrinho.remove(index);
                produtoRemovido = true;
                System.out.println("Produto removido com sucesso.");
                break;
            }
        }

        // Se o produto não foi encontrado e removido, exibe uma mensagem de erro
        if (!produtoRemovido) {
            System.out.println("Erro: Produto não encontrado com o código fornecido.");
        }
    }
}
