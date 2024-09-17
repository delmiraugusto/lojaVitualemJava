package com.loja.virtual.modelos.gestor;

import java.util.*;

public class ClienteQueMaisComprou {
    private Map<String, Double> comprasPorCliente;

    public ClienteQueMaisComprou() {
        this.comprasPorCliente = new HashMap<>();
    }

    public void adicionarCompra(String cliente, double valorCompra) {
        comprasPorCliente.put(cliente, comprasPorCliente.getOrDefault(cliente, 0.0) + valorCompra);
    }

    public double getTotalCompras(String cliente) {
        return comprasPorCliente.getOrDefault(cliente, 0.0);
    }

    public String getClienteComMaisCompras() {
        return comprasPorCliente.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public void exibirTodos() {
        comprasPorCliente.forEach((cliente, total) -> 
            System.out.println("Cliente: " + cliente + ", Total comprado: " + total)
        );
    }
}
