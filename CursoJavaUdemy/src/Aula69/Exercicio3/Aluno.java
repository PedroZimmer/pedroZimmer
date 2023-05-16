package Aula69.Exercicio3;

import java.util.Scanner;

public class Aluno {

    Scanner sc = new Scanner(System.in);

    private String name;
    private double[] notas;

    public void setNome() {
        System.out.println("Insert name:");
        this.name = sc.nextLine();
    }

    public void setNotas() {
        notas = new double[3];
        System.out.println("Insert notes:");
        for (int i = 0; i < 3; i++) {
            this.notas[i] = sc.nextDouble();
        }
    }

    public double getMedia() {
        double media = 0;
        for (int i = 0; i < 3; i++) {
            media += this.notas[i];
        }
        return media;
    }

    public String resultado() {
        if (this.getMedia() >= 60) {
            return "Approved";
        } else {
            return "Disapproved";
        }
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Media: " + this.getMedia() + "\n" + this.resultado();
    }


}
