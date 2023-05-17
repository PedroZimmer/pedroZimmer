package Aula90.Exercicio03;

import org.w3c.dom.ls.LSOutput;

public class Person {

    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public static double calculateAverageHeight(Person[] people) {
        double sum = 0.0;
        for (int i = 0; i < people.length; i++) {
            sum += people[i].getHeight();
        }
        return sum / people.length;
    }

    public static void peopleLessThen16 (Person[] people) {
        int sum = 0;
        String vector[] = new String[people.length];
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < 16) {
                sum += 1;
                vector[i] = people[i].name;
            }
        }
        double perc = ((double) sum /people.length)*100;
        System.out.println("People less then 16:" + perc + "%");
        System.out.println("Names:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                System.out.println(vector[i]);
            }
        }

    }

}
