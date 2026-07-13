package com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex04.application;

import com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex04.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter converter = new CurrencyConverter();
        System.out.print("Qual é o preço do dolar? R$");
        converter.dollarPrice = sc.nextDouble();
        System.out.print("Quantos dolares serão comprados? $");
        converter.dollar = sc.nextDouble();

        System.out.printf("\nValor a ser pagos em reais: R$%.2f", converter.dollarToReal());

    }
}
