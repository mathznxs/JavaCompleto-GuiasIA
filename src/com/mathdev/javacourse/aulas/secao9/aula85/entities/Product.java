package com.mathdev.javacourse.aulas.secao9.aula85.entities;

public class Product {
    public String nome;
    public double preco;
    public int quantidade;

    public Product () {}

    public Product(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public double ValorTotalEmEstoque () {
        return preco * quantidade;
    }
    public void AdicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void RemoverProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome
                + ", Preço: R$"
                + preco
                + ", Qnt: "
                + quantidade
                + ", Valor total em estoque: R$"
                + ValorTotalEmEstoque();
    }
}
