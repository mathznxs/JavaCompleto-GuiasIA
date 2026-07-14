package com.mathdev.javacourse.aulas.secao9.aula83.entities;

public class Product {
    public String nome;
    public double preco;
    public int quantidade;

    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double ValorTotalEmEstoque() {
        return preco * quantidade;
    }
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removerProduto(int quantidade) {
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
