package com.loja.virtual.modelos.produto;

import com.loja.virtual.modelos.pedido.Pedido;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoPedido {
    private long cod;
    private int quantidade;
    private Produto produto;
    private Pedido pedido;

    long numeroAleatorio = new Random().nextLong(1000000000);
    public void setCodPedido() {
        this.cod = numeroAleatorio;
    }
}
