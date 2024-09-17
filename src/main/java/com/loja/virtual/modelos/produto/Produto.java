package com.loja.virtual.modelos.produto;


import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;


import com.loja.virtual.modelos.cliente.Cliente;
import static com.loja.virtual.modelos.cliente.Cliente.clientes;
import com.loja.virtual.modelos.pedido.Pedido;
import static com.loja.virtual.modelos.pedido.Pedido.pedidos;
import static com.loja.virtual.modelos.pedido.Pedido.produtosPedido;

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

    public static void removerProduto(int codProduto) {

    }
}
