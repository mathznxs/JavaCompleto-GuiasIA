package com.mathdev.javacourse.aulas.secao10.exerciciosfixacao.ex03.application;

import com.mathdev.javacourse.aulas.secao10.exerciciosfixacao.ex03.entities.Peoples;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int quantidade = sc.nextInt();

        Peoples[] vect = new Peoples[quantidade];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("\nDados da %dª pessoa: \n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new Peoples(name, age, height);
        }
        double media = 0;
        for (int i = 0; i < vect.length; i++) {
            media += vect[i].getHeight();
        }
        media = media / vect.length;

        System.out.printf("\n\nAltura média das %d pessoas: %.2f", vect.length, media);

        int menoresDe16 = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                menoresDe16 += 1;
            }
        }
        double porcentagem = (menoresDe16 * 100.0) / vect.length;
        System.out.print("\nPessoas com menos de 16 anos: " +  porcentagem);
        System.out.print("\nNomes: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.printf("%s; ", vect[i].getName());
            }
        }

        sc.close();
    }
}
