    package com.mathdev.javacourse.aulas.secao10.exerciciosfixacao.ex05;

    import java.util.Locale;
    import java.util.Scanner;

    public class Program {
        public static void main (String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.print("Quantos números você vai digitar? ");
            int quantidade = sc.nextInt();
            int[] vect = new int[quantidade];
            int posicao = 0;

            int maior = vect[0];
            for (int i = 0; i < vect.length; i++) {
                System.out.print("Digite um número: ");
                vect[i] = sc.nextInt();
                if (vect[i] > maior) {
                    maior = vect[i];
                    posicao = i;
                }
            }
            System.out.printf("\nMaior número: %d", maior);
            System.out.printf("\nPosição: %d", posicao);
            sc.close();
        }
    }
