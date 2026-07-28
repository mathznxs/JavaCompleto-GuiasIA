package com.mathdev.javacourse.aulas.secao10.exerciciosfixacao.ex01.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantidade = sc.nextInt();

        int[] numbers = new int[quantidade];

        sc.nextLine();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("\nNúmeros negativos: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.printf("%d ", numbers[i]);
            }
        }
        sc.close();
    }
}
