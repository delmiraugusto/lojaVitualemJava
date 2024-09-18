package com.loja.virtual.modelos.cliente;

import com.loja.virtual.modelos.produto.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoverPedidos {
    public static void removerPedido(String user) {
        Scanner scanner = new Scanner(System.in);
        int opt = 0;

        System.out.printf("""
                SerraTec Games
                Usuario: %s
                %n""", user);

        // Exibe a lista de produtos
        Produto.listarProdutos();

        System.out.println("""
                Escolha o código do jogo que deseja remover:
                Digite o número referente ao código do jogo:
                """);
        try {
            opt = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
            removerPedido(user);
            scanner.next();
        }
        // Chama o método para remover o produto com base no código do produto
        removerProduto(opt);
    }

    // Método para remover o produto da lista usando o código do produto
    private static void removerProduto(int codProduto) {
        Produto produtoRemover = null;

        // Procura o produto pelo código
        for (Produto produto : Produto.produtos) {
            if (produto.getCodProduto() == codProduto) {
                produtoRemover = produto;
                break;
            }
        }

        // Se encontrar o produto, remove
        if (produtoRemover != null) {
            Produto.produtos.remove(produtoRemover);
            System.out.println("Produto removido: " + produtoRemover.getNomeProduto());
        } else {
            System.out.println("Produto não encontrado com o código fornecido.");
        }
    }
}
