package com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex02.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
        grossSalary -= tax;
    }

    @Override
    public String toString() {
        return name
                + ", R$"
                + String.format("%.2f", grossSalary);
    }
}
