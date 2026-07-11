package com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex01.application;

import com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite a altura e largura do retângulo: ");
        System.out.print("Altura: ");
        rectangle.height = sc.nextDouble();
        System.out.print("Largura: ");
        rectangle.width = sc.nextDouble();

        System.out.printf("\nÁrea: %.2f", rectangle.area());
        System.out.printf("\nPerimetro: %.2f", rectangle.perimeter());
        System.out.printf("\nDiagonal: %.2f", rectangle.diagonal());
    }
}
