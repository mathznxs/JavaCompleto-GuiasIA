package com.mathdev.javacourse.aulas.secao8.exerciciosfixacao.ex04.util;

public class CurrencyConverter {
    public double dollarPrice;
    public double dollar;
    public double amount;

    public static final double IOF = 0.06;

    public double dollarToReal() {
        amount = dollar * dollarPrice;
        double iof = amount * IOF;
        return amount + iof;
    }

}
