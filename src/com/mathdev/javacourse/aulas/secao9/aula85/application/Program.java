package com.mathdev.javacourse.aulas.secao9.aula85.application;

import com.mathdev.javacourse.aulas.secao9.aula85.entities.Product;

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
        Product product = new Product(nome, preco);

        System.out.println("\nDados do produto: " + product);

        System.out.print("\nDigite a quantidade de produtos que deseja adicionar no estoque: ");
        int quantidade = sc.nextInt();
        product.AdicionarProduto(quantidade);

        System.out.println("\nDados atualizados do produto: " + product);

        System.out.print("\nDigite a quantidade de produtos que deseja remover no estoque: ");
        quantidade = sc.nextInt();
        product.RemoverProduto(quantidade);

        System.out.println("\nDados atualizados do produto: " + product);
    }
}
