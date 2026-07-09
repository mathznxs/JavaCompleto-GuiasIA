package com.mathdev.javacourse.aulas.secao8.aula73.application;

import com.mathdev.javacourse.aulas.secao8.aula73.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Insira as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Insira as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("\nÁrea do triângulo X: %.4f", areaX);
        System.out.printf("\nÁrea do triângulo Y: %.4f", areaY);

        if (areaX > areaY) {
            System.out.println("\nMaior área: X");
        } else {
            System.out.println("\nMaior área: Y");
        }
    }
}
