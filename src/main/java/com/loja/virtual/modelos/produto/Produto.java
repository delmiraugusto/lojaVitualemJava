package com.loja.virtual.modelos.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
