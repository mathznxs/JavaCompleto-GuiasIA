package com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex02.application;

import com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salário Bruto: R$");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Taxa: ");
        employee.tax = sc.nextDouble();

        System.out.println("Funcionário: " + employee);

        System.out.print("Qual o percentual de aumento salarial: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Dados atualizados do funcionário: " + employee);
    }
}
