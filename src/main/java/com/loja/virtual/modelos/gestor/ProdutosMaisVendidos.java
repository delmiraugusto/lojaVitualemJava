package com.loja.virtual.modelos.gestor;

import java.util.*;
public class ProdutosMaisVendidos {
    
    private Map<String, Integer> vendasPorProduto;

    
    public ProdutosMaisVendidos() {
        this.vendasPorProduto = new HashMap<>();
    }

    public void adicionarVenda(String produto, int quantidade) {
        vendasPorProduto.put(produto, vendasPorProduto.getOrDefault(produto, 0) + quantidade);
    }

    public int getQuantidadeVendida(String produto) {
        return vendasPorProduto.getOrDefault(produto, 0);
    }

    public List<String> getMaisVendidos(int topN) {
        return vendasPorProduto.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(topN)
                .map(Map.Entry::getKey)
                .toList();
    }

    public void exibirTodos() {
        vendasPorProduto.forEach((produto, quantidade) -> 
            System.out.println("Produto: " + produto + ", Quantidade vendida: " + quantidade)
        );
    }
}
