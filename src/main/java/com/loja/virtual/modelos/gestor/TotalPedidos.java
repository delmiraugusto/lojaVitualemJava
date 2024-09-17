package com.loja.virtual.modelos.gestor;

import java.util.ArrayList;
import java.util.List;

public class TotalPedidos {
    
    private List<Double> pedidos;
    private int numeroDePedidos;
    private double valorTotalPedidos;

    
    public TotalPedidos() {
        this.pedidos = new ArrayList<>();
        this.numeroDePedidos = 0;
        this.valorTotalPedidos = 0.0;
    }

    
    public void adicionarPedido(double valorPedido) {
        pedidos.add(valorPedido);
        numeroDePedidos++;
        valorTotalPedidos += valorPedido;
    }

    
    public int getTotalPedidos() {
        return numeroDePedidos;
    }

    
    public double getValorTotalPedidos() {
        return valorTotalPedidos;
    }

    
    public double getMediaValorPedido() {
        if (numeroDePedidos == 0) {
            return 0.0;
        }
        return valorTotalPedidos / numeroDePedidos;
    }

    
    public void exibirPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("Pedido " + (i + 1) + ": R$ " + pedidos.get(i));
        }
        System.out.println("Total de Pedidos: " + getTotalPedidos());
        System.out.println("Valor Total dos Pedidos: R$ " + getValorTotalPedidos());
        System.out.println("Valor Médio por Pedido: R$ " + getMediaValorPedido());
    }
}
