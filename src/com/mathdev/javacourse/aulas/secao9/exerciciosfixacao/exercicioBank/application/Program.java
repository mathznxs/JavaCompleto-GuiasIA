package com.mathdev.javacourse.aulas.secao9.exerciciosfixacao.exercicioBank.application;

import com.mathdev.javacourse.aulas.secao9.exerciciosfixacao.exercicioBank.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do titular: ");
        String holder = sc.nextLine();
        Account account = new Account(holder, number);
        System.out.print("Gostaria de fazer um depósito inicial? (S/N) ");
        char decisaoDeposito = sc.next().charAt(0);
        if (decisaoDeposito == 'S' || decisaoDeposito == 's') {
            System.out.print("Digite o valor para o depósito inicial: R$");
            double initialDeposit = sc.nextDouble();
            account.deposit(initialDeposit);
        }
        System.out.print("\nDados da conta: " + account);

        System.out.print("\nDigite o valor para depositar: R$");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("\nDados da conta: " + account);

        System.out.print("\nDigite o valor para depositar: R$");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.print("\nDados da conta: " + account);
    }
}
