package com.loja.virtual.modelos.produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public static void pegarProduto(String user, int opt, double total) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodProduto() == opt) {
                for(Cliente c : clientes) {
                    if(Objects.equals(c.getLogin(), user)) {
                        Pedido pedido = new Pedido();
                        pedido.setCliente(c);
                        pedido.setDataPedido(LocalDate.now());
                        produtosPedido.add(produtos.get(i));
                        pedidos.add(pedido);
                        System.out.println("Carrinho:");
                    }
                }
                for(int k = 0; k < produtosPedido.size(); k++) {
                    System.out.printf("""
                                    %d - %s -> %.2f
                                    """,
                            k+1,
                            produtosPedido.get(k).getNomeProduto(),
                            produtos.get(k).getValorUnitario()
                    );
                    total += produtos.get(k).getValorUnitario();
                }
                System.out.println("\nTotal: \n"+total);
            }
        }
    }
}
