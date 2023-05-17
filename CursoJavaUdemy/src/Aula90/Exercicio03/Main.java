package Aula90.Exercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n = input.nextInt();

        Person[] people = new Person[n]; //people is an array of Person objects

        for (int i = 0; i < n; i++) {
            System.out.println("Person #" + (i + 1) + ":");
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Age: ");
            int age = input.nextInt();
            System.out.print("Height: ");
            double height = input.nextDouble();
            people[i] = new Person(name, age, height);
        }

        double avg = Person.calculateAverageHeight(people);
        System.out.println("Average height: " + String.format("%.2f", avg));

        Person.peopleLessThen16(people);






    }


}
