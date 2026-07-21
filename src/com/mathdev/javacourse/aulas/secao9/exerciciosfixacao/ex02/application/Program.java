package com.mathdev.javacourse.aulas.secao9.exerciciosfixacao.ex02.application;

import com.mathdev.javacourse.aulas.secao9.exerciciosfixacao.ex02.entities.Subscription;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do plano: ");
        int planCode = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String client = sc.nextLine();
        System.out.print("Digite o valor da taxa mensal: R$");
        double monthlyFee = sc.nextDouble();
        Subscription subscription = new Subscription(planCode, client, monthlyFee);
        System.out.print("O cliente possuí cupom de desconto? (S/N)");
        char discountChar = sc.next().charAt(0);
        if (discountChar == 'S' || discountChar == 's') {
            System.out.print("Digite o valor de desconto: R$");
            double discount = sc.nextDouble();
            subscription.setDiscount(discount);
        }

        System.out.print("\nDados de inscrição: " + subscription);

        System.out.print("\nDigite a porcentagem de rajuste: ");
        double percentage = sc.nextDouble();
        subscription.increaseFree(percentage);

        System.out.print("\nDados de inscrição atualizados: " + subscription);


    }
}
