package com.mathdev.javacourse.fundamentosAula.sistemafuncionarios.application;

import com.mathdev.javacourse.fundamentosAula.sistemafuncionarios.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter employee data: ");
        System.out.print("\nName: ");
        String name = sc.nextLine();
        System.out.print("Gross Salary: R$");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.print("\nEmployee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextInt());

        System.out.print("\nUpdated data: " + employee);

        sc.close();
    }
}
