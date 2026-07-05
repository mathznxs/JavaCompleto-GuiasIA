package com.mathdev.javacourse.fundamentosAula.exercicio04.application;

import com.mathdev.javacourse.fundamentosAula.exercicio04.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        int accoun = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holder = sc.next();
        System.out.print("Enter initial deposit value: R$");
        double balance = sc.nextDouble();

        Account account = new Account(accoun, holder, balance);

        System.out.print("\nAccount data: " + account);

        System.out.print("\nEnter a deposit value: R$");
        account.deposit(sc.nextDouble());
        System.out.print("\nUpdated account: " + account);

        System.out.print("\nEnter a withraw value: R$");
        account.withraw(sc.nextDouble());
        System.out.print("\nUpdated account: " + account);
        sc.close();
    }
}
