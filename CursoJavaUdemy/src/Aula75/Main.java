package Aula75;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto p1;
        p1 = new Produto("TV", 900.00, 10);


        Produto p2;

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        p2 = new Produto(name, price, quantity);

        System.out.println("Product data: " + p2);

        System.out.print("Enter the number of products to be added in stock: ");
        int x = sc.nextInt();
        p2.addProducts(x);
        System.out.println("Updated data: " + p2);
        System.out.println("Enter the number of products to be removed from stock: ");
        x = sc.nextInt();
        p2.removeProducts(x);
        System.out.println("Updated data: " + p2);









    }
}

