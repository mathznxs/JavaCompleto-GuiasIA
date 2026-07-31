package com.mathdev.javacourse.aulas.secao10.exerciciosfixacao.ex06;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quais valores vai ter cada setor? ");
        int quantidade = sc.nextInt();
        int[] vectA = new int[quantidade];
        int[] vectB = new int[quantidade];
        int[] vectC = new int[quantidade];

        System.out.print("\nColeta dos valores do vetor A: \n3");
        for (int i = 0; i < vectA.length; i++) {
            System.out.print("Digite um número: ");
            vectA[i] = sc.nextInt();
        }
        System.out.print("\nColeta dos valores do vetor B: \n");
        for (int i = 0; i < vectB.length; i++) {
            System.out.print("Digite um número: ");
            vectB[i] = sc.nextInt();
        }
        System.out.print("\nSoma das posições entre os valores do vetor A e o vetor B: ");
        for (int i = 0; i < vectC.length; i++) {
            System.out.printf("%d ", (vectA[i] + vectB[i]));
        }

        sc.close();
    }
}
