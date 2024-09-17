package com.loja.virtual.modelos.produto;

import com.loja.virtual.modelos.cliente.Cliente;
import com.loja.virtual.modelos.pedido.Pedido;
import java.time.LocalDate;
import java.util.Objects;
import static com.loja.virtual.modelos.cliente.Cliente.clientes;
import static com.loja.virtual.modelos.pedido.Pedido.carrinho;
import static com.loja.virtual.modelos.produto.Produto.produtos;

public class PegarProduto {
    public static void pegarProduto(String user, int opt, double total) {
        Pedido pedido = new Pedido();
        ProdutoPedido pp = new ProdutoPedido();
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodProduto() == opt) {
                for(Cliente c : clientes) {
                    if(Objects.equals(c.getLogin(), user)) {
                        pedido.setCliente(c);
                        pedido.setDataPedido(LocalDate.now());
                        pp.setProduto(produtos.get(i));
                        pp.setQuantidade(1);
                        pp.setPedido(pedido);
                        carrinho.add(pp);
                        Pedido.todosPedidos.add(pedido);
                        System.out.println("Carrinho:");
                    }
                }
            }
        }
        for(int k = 0; k < carrinho.size(); k++) {
            System.out.printf("""
                                    %d - %s -> %.2f quant.: %d
                                    """,
                    k+1,
                    carrinho
                            .get(k)
                            .getProduto()
                            .getNomeProduto(),
                    carrinho
                            .get(k).
                            getProduto().
                            getValorUnitario(),
                    carrinho
                            .get(k)
                            .getQuantidade()
            );
            total += carrinho.
                    get(k).
                    getProduto().
                    getValorUnitario();
        }
        System.out.println("\nTotal: \n"+total);
    }
}
