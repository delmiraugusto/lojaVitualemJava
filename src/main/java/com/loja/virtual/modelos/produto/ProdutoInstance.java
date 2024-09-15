package com.loja.virtual.modelos.produto;

import java.util.Date;

public class ProdutoInstance {
    public static void produtoInstance() {
        Produto jogo1 = new Produto();
        jogo1.setCodProduto(1);
        jogo1.setDescricao("Jogo do Ano");
        jogo1.setNomeProduto("Baldur's Gate III");
        jogo1.setDataFabricacao("03-08-2023");
        jogo1.setQuantidadeEstoque(5000);
        jogo1.setValorUnitario(299.99);
        Produto.produtos.add(jogo1);

        Produto jogo2 = new Produto();
        jogo2.setCodProduto(2);
        jogo2.setDescricao("Seila");
        jogo2.setNomeProduto("Black Myth Wukong");
        jogo2.setDataFabricacao("03-08-2024");
        jogo2.setQuantidadeEstoque(499);
        jogo2.setValorUnitario(299.99);
        Produto.produtos.add(jogo2);

        Produto jogo3 = new Produto();
        jogo3.setCodProduto(3);
        jogo3.setDescricao("Bla");
        jogo3.setNomeProduto("LOL");
        jogo3.setDataFabricacao("03-08-2009");
        jogo3.setQuantidadeEstoque(5000);
        jogo3.setValorUnitario(0.0);
        Produto.produtos.add(jogo3);

        Produto jogo4 = new Produto();
        jogo4.setCodProduto(4);
        jogo4.setDescricao("MOBA");
        jogo4.setNomeProduto("Dota 2");
        jogo4.setDataFabricacao("03-08-2015");
        jogo4.setQuantidadeEstoque(5000);
        jogo4.setValorUnitario(0.0);
        Produto.produtos.add(jogo4);
    }
}
