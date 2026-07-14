package com.mathdev.javacourse.aulas.secao9.exercicioBank.entities;

public class Account {
    private String holder;
    private int number;
    private double balance;

    public String getHolder() {
        return holder;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public Account(String holder, int number, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    public void deposit (double deposit) {
        balance += deposit;
    }
    public void withdraw (double withdraw) {
        balance -= withdraw + 5.0;
    }

    @Override
    public String toString() {
        return "Conta: "
                + number
                + ", Titular: "
                + holder
                + ", Saldo: R$"
                + balance;
    }
}
