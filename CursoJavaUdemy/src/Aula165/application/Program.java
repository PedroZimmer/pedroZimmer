package Aula165.application;

import Aula165.entities.LegalPerson;
import Aula165.entities.Person;
import Aula165.entities.PrivatePerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PrivatePerson(name, anualIncome, healthExpenditures));
            }else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new LegalPerson(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID:");
        for (Person person : list) {
            System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
        }

        System.out.println();

        double sum = 0.0;
        for (Person person : list) {
            sum += person.tax();
        }
        System.out.println("TOTAL TAXES: ");
        System.out.println("$ " + String.format("%.2f", sum));



    }
}
