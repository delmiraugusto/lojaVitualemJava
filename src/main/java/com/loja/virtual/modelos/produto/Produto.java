package com.loja.virtual.modelos.produto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    private int codProduto;
    private String nomeProduto;
    private String descricao;
    private int quantidadeEstoque;
    private Date dataFabricacao;
    private double valorUnitario;
}
