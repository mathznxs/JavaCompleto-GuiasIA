package com.mathdev.javacourse.aulas.secao9.exerciciosfixacao.ex02.entities;

public class Subscription {
    private int planCode;
    private String client;
    private double monthlyFee;
    private double discount;

    public Subscription(int planCode, String client, double monthlyFree) {
        this.planCode = planCode;
        this.client = client;
        this.monthlyFee = monthlyFree;
    }
    public Subscription(int planCode, String client, double monthlyFree, double discount) {
        this.planCode = planCode;
        this.client = client;
        this.monthlyFee = monthlyFree;
        this.discount = discount;
    }
    public int getPlanCode() {
        return planCode;
    }
    public String getClient() {
        return client;
    }
    public double getMonthlyFree() {
        return monthlyFee;
    }
    public double getDiscount() {
        return discount;
    }
    public void setClient(String client) {
        this.client = client;
    }
    public void setMonthlyFree(double monthlyFree) {
        this.monthlyFee = monthlyFree;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double amountToPay () {
        return monthlyFee - discount;
    }
    public void increaseFree(double percentage) {
        monthlyFee += monthlyFee * percentage / 100;
    }

    @Override
    public String toString() {
        return "Plano: "
                + planCode
                + ", Cliente: "
                + client
                + ", Mensalidade: R$"
                + String.format("%.2f", monthlyFee)
                + ", Desconto: "
                + discount
                + ", Total a pagar: R$"
                + String.format("%.2f", amountToPay());
    }
}
