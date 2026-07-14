package com.mathdev.javacourse.aulas.secao9.aula86.entities;

import java.util.Locale;

public class Product {
    private String nome;
    private double preco;
    private int quantidade;

    // Controladores
    public Product(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Encapsulamentos
    public String getNome() {
        return nome;
    }
    public String setNome(String nome) {
        return this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public double setPreco(double preco) {
        return this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    // Métodos
    public double ValorTotalEmEstoque() {
        return preco * quantidade;
    }
    public void AdicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void RemoverProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    // toString para padronizar uma "mensagem"
    public String toString() {
        return nome
                + ", Preço: R$"
                + String.format("%.2f", preco)
                + ", Qnt: "
                + quantidade
                + ", Valor total em estoque: R$"
                + String.format("%.2f", ValorTotalEmEstoque());
    }
}
