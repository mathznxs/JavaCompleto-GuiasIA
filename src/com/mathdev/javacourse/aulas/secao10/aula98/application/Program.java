package com.mathdev.javacourse.aulas.secao10.aula98.application;

import com.mathdev.javacourse.aulas.secao10.aula98.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos para cadastrar: ");
        int quantidade = sc.nextInt();

        Product[] vect = new Product[quantidade];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Preço: R$");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();
        }
        double media = soma / vect.length;
        System.out.printf("\nA média de preço dos produtos é R$%.2f", media);
    }
}
