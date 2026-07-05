package com.mathdev.javacourse.fundamentosAula.sistemaestoque.application;

import com.mathdev.javacourse.fundamentosAula.sistemaestoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter data: ");
        System.out.print("\nName: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.print("\nProduct data: " + product);

        System.out.print("\n\nEnter the number of products to be added in stock: ");
        product.addProduct(sc.nextInt());

        System.out.print("\nUpdated data: " + product);

        System.out.print("\n\nEnter the number of products to be removed from stock: ");
        product.removeProduct(sc.nextInt());

        System.out.print("\n\nUpdated data: " + product);

        sc.close();
    }
}
