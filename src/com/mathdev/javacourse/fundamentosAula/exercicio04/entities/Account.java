package com.mathdev.javacourse.fundamentosAula.exercicio04.entities;

public class Account {
    private int account;
    private String holder;
    private double balance;

    public Account (int account, String holder, double balance) {
        this.account = account;
        this.holder = holder;
        this.balance = balance;
    }
    public double deposit (double amount) {
        return balance += amount;
    }
    public double withraw (double amount) {
        return balance -= amount + 5;
    }

    @Override
    public String toString () {
        return "Account: "
                + account
                + ", Holder: "
                + holder
                + ", Balance: "
                + String.format("%.2f", balance);
    }

}
