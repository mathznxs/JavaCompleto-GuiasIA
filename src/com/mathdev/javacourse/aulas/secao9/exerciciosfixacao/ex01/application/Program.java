package com.mathdev.javacourse.aulas.secao9.exerciciosfixacao.ex01.application;

import com.mathdev.javacourse.aulas.secao9.exerciciosfixacao.ex01.entities.Book;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do livro: ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o título do livro: ");
        String title = sc.nextLine();
        System.out.print("Digite o autor do livro: ");
        String author = sc.nextLine();
        Book book = new Book(code, title, author);
        System.out.print("\nGostaria de acrescentar uma quantidade inicial de exemplares? (S/N) ");
        char decisaoBooks = sc.next().charAt(0);
        if (decisaoBooks == 'S' || decisaoBooks == 's') {
            System.out.print("\nQuantos exemplares gostaria de adicionar ao estoque? ");
            int amount = sc.nextInt();
            book.addBooks(amount);
        }
        System.out.print("\nDados do livro: " + book);

        System.out.print("\n\nQuantos exemplares gostaria de adicionar ao estoque? ");
        int amount = sc.nextInt();
        book.addBooks(amount);

        System.out.print("\nDados atualizados do livro: " + book);

        System.out.print("\n\nQuantos exemplares gostaria de remover ao estoque? ");
        amount = sc.nextInt();
        if (amount > book.getQuantity()) {
            System.out.print("\nNão é possível remover essa quantidade de exemplares, pois excede a quantidade total no estoque!");
        } else {
            book.removeBooks(amount);
        }

        System.out.print("\nDados atualizados do livro: " + book);
    }
}
