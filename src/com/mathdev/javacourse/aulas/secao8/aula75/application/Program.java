package com.mathdev.javacourse.aulas.secao8.aula75.application;

import com.mathdev.javacourse.aulas.secao8.aula75.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite os dados do produto: ");
        System.out.print("\nNome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: R$");
        product.price = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println("\nDados do produto: " + product);

        System.out.print("\nDigite a quantidade de " + product.name + " que deseja adicionar ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("\nDados atualizados do produto: " + product);

        System.out.print("\nDigite a quantidade de " + product.name + " que deseja remover ao estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nDados atualizados do produto: " + product);


    }
}
