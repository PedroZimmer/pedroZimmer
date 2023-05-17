package Aula99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();


        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Funcionario(id, name, salary));
        }

        System.out.println("Enter the employee id that will have salary increase: ");

        int id = sc.nextInt();
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (func == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            func.increaseSalary(percentage);
        }

        System.out.println("List of employees: ");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }
        sc.close();









    }
}
