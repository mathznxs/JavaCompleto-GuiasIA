package com.mathdev.javacourse.aulas.secao9.aula86.application;

import com.mathdev.javacourse.aulas.secao9.aula86.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: R$");
        double preco = sc.nextDouble();
        Product product = new Product(nome, preco);

        product.setNome("Smart TV");
        System.out.print("\nNome do produto atualizado: " + product.getNome());
        product.setPreco(1200.00);
        System.out.print("\nValor do produto atualizado: " + product.getPreco());
        System.out.print("\nQuantidade em estoque: " + product.getQuantidade());

        System.out.print("\n\nDados do produto: " + product);

        System.out.print("\n\nDigite a quantidade de produtos que deseja adicionar ao estoque: ");
        int quantidade = sc.nextInt();
        product.AdicionarProduto(quantidade);

        System.out.print("\n\nDados atualizados do produto: " + product);

        System.out.print("\n\nDigite a quantidade de produtos que deseja remover ao estoque: ");
        quantidade = sc.nextInt();
        product.RemoverProduto(quantidade);

        System.out.print("\n\nDados atualizados do produto: " + product);




    }
}
