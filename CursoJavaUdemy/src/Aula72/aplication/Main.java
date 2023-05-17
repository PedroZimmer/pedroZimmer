package Aula72.aplication;

import Aula72.util.CurrencyCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        CurrencyCalculator.dollarToReal(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyCalculator.dollarToReal(dollarPrice, amount));



    }
}
