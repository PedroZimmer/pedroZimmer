package Aula90.Exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How much numbers do you want to enter?");
        int n = input.nextInt();
        int vect1[] = new int[n];
        for (int i = 0; i < vect1.length; i++) {
            System.out.println("Enter a number: ");
            vect1[i] = input.nextInt();
        }

        System.out.println("Numbers entered: ");
        for (int i = 0; i < vect1.length; i++) {
            System.out.println(vect1[i]);
        }
        Calc.sum(vect1);
        Calc.avg(vect1);



    }
}
