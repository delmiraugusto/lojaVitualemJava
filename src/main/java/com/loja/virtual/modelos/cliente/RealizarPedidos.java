package com.loja.virtual.modelos.cliente;

import com.loja.virtual.modelos.produto.Produto;
import java.util.Scanner;

public class RealizarPedidos {
    public static void realizarPedidos(String user) {
        try (Scanner sc = new Scanner(System.in)) {
            int opt;
            double total = 0;
            System.out.printf("""
                    SerraTec Games
                    Usuario: %s
                    %n""", user);
            Produto.listarProdutos();
            System.out.println(""" 
                    
                    Escolha o jogo:
                    Digite o número referente ao jogo.                   
                    """);
            opt = sc.nextInt();

            Produto.pegarProduto(user,opt, total);
        }
    }
}