package com.loja.virtual.modelos.gestor;

import java.util.Scanner;

import com.loja.virtual.modelos.produto.Produto;

public class CadastrarProdutos {
    

    public static void cadastrarProdutos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastrar Produto");
        Produto jogo = new Produto();
        System.out.print("Insira a Descrição: ");
        String descricao = sc.nextLine();
        jogo.setDescricao(descricao);
        System.out.print("Insira o Nome do Produto: ");
        String nome = sc.nextLine();
        jogo.setNomeProduto(nome);
        System.out.print("Insira a Data de Fabricação: ");
        String dataFabricao = sc.nextLine();
        jogo.setDataFabricacao(dataFabricao);
        System.out.print("Insira a Quantidade de estoque: ");
        int estoque = sc.nextInt();
        jogo.setQuantidadeEstoque(estoque);
        System.out.print("Insira o Preço: ");
        double preco = sc.nextDouble();
        jogo.setValorUnitario(preco);
        Produto.produtos.add(jogo);
    }
}
