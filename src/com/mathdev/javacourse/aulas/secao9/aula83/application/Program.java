package com.mathdev.javacourse.aulas.secao9.aula83.application;

import com.mathdev.javacourse.aulas.secao9.aula83.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: R$");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        Product product = new Product(nome, preco, quantidade);

        System.out.println("\nDados do produto:" + product);

        System.out.print("\nDigite a quantidade de produtos que deseja adicionar ao estoque: ");
        quantidade = sc.nextInt();
        product.adicionarProduto(quantidade);

        System.out.println("\nDados atualizados do produto: " + product);

        System.out.print("\nDigite a quantidade de produtos que deseja remover ao estoque: ");
        quantidade = sc.nextInt();
        product.removerProduto(quantidade);

        System.out.println("\nDados atualizados do produto: " + product);
    }
}
