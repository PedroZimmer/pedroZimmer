package Aula90.Exercicio01;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            List<String> listaNeg = new ArrayList<>();


            System.out.println("How much numbers do you want to enter?");
            int n = input.nextInt();
            int vect1[] = new int[n];
            for (int i = 0; i < vect1.length; i++) {
                System.out.println("Enter a number: ");
                vect1[i] = input.nextInt();
                if (vect1[i] < 0) {
                    listaNeg.add(String.valueOf(vect1[i]));
                }
            }

            System.out.println("Negative numbers: " + listaNeg);



            input.close();

        }
}
