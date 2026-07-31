package com.mathdev.javacourse.aulas.secao10.exerciciosfixacao.ex02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantidade = sc.nextInt();

        double[] vect = new double[quantidade];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("\nValores: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.2f; ", vect[i]);
        }
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }
        System.out.printf("\nSoma: %.1f", soma);
        double media = soma / vect.length;
        System.out.printf("\nMédia: %.1f", media);

        sc.close();
    }
}
