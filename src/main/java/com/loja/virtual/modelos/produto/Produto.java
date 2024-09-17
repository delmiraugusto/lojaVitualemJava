package com.loja.virtual.modelos.produto;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Produto {
    private int codProduto;
    private String nomeProduto;
    private String descricao;
    private int quantidadeEstoque;
    private String dataFabricacao;
    private double valorUnitario;
    public static List<Produto> produtos = new ArrayList<>();

    public static void listarProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.printf("%d - %s -> %.2f %n",
                    produtos.get(i).getCodProduto(),
                    produtos.get(i).getNomeProduto(),
                    produtos.get(i).getValorUnitario()
            );
        }
    }
}
