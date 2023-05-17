package Aula90.Exercicio02;

public class Calc {

    public static void sum(int vect1[]) {
        int sum = 0;
        for (int i = 0; i < vect1.length; i++) {
            sum += vect1[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void avg(int vect1[]) {
        int sum = 0;
        for (int i = 0; i < vect1.length; i++) {
            sum += vect1[i];
        }
        System.out.println("Average: " + sum/vect1.length);
    }


}
