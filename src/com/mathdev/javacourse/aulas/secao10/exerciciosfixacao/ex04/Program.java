package com.mathdev.javacourse.aulas.secao10.exerciciosfixacao.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadePares = 0;

        System.out.print("Quantos números você vai digitar? ");
        int quantidade = sc.nextInt();
        int[] vect = new int[quantidade];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                quantidadePares++;
            }
        }
        System.out.printf("\nQuantidade de pares: %d", quantidadePares);
        System.out.print("\nNúmeros pares: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
            }
        }
        sc.close();
    }
}
