package com.mathdev.javacourse.aulas.secao10.aula97.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vão entrar na pesquisa de altura média? ");
        int quantidade = sc.nextInt();
        double[] pessoas = new double[quantidade];

        for (int i=0; i < quantidade; i++) {
            System.out.printf("Digite a altura da %dª pessoa: ", i+1);
            pessoas[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i=0; i < quantidade; i++) {
            soma += pessoas[i];
        }
        double media = soma / quantidade;
        System.out.printf("\nAltura média: %.2f", media);
    }
}
