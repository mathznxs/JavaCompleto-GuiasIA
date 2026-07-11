package com.mathdev.javacourse.aulas.secao8.aula74.application;

import com.mathdev.javacourse.aulas.secao8.aula74.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Dados dos produtos:");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: R$");
        product.price = sc.nextDouble();
        System.out.print("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println("\n" + product);
    }
}
