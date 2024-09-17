package com.loja.virtual.modelos.cliente;

import java.util.Scanner;

import com.loja.virtual.modelos.produto.Produto;

public class RealizarPedidos {
    public static void realizarPedidos(String user) {
        Scanner sc = new Scanner(System.in);
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

        removerProduto(){
    }
}
