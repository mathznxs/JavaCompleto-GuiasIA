package com.mathdev.javacourse.aulas.secao9.exerciciosfixacao.ex01.entities;

public class Book {
    private int code;
    private String title;
    private String author;
    private int quantity;

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public Book(int code, String title, String author) {
        this.code = code;
        this.title = title;
        this.author = author;
    }

    public Book(int code, String title, String author, int quantityInitial) {
        this.code = code;
        this.title = title;
        this.author = author;
    }

    public void addBooks(int amount) {
        quantity += amount;
    }
    public void removeBooks(int amount) {
        quantity -= amount;
    }

    @Override
    public String toString() {
        return "Código: "
                + code
                + ", Título: "
                + title
                + ", Autor: "
                + author
                + ", Quantidade: "
                + quantity;
    }
}
