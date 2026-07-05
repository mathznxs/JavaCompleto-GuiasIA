package com.mathdev.javacourse.fundamentosAula.sistemaestoque.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProduct(int quantity) {
        this.quantity += quantity;
    }
    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name
                + ", R$"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total:"
                + String.format("%.2f", totalValueInStock());
    }
}
