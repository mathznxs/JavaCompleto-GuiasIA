package com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex03.application;

import com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nome: ");
        student.name = sc.nextLine();
        System.out.print("Nota do 1º Bimestre: ");
        student.nota1 = sc.nextDouble();
        System.out.print("Nota do 2º Bimestre: ");
        student.nota2 = sc.nextDouble();
        System.out.print("Nota do 3º Bimestre: ");
        student.nota3 = sc.nextDouble();

        System.out.print("\nNota final: " + student.finalGrade());
        if (student.finalGrade() > 60.0) {
            System.out.println("\nVocê passou! Parabéns");
        } else {
            System.out.println("\nVocê reprovou! Faltando " + student.missingPoints() + " pontos");
        }
    }
}
