package Aula99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Funcionario {

    Scanner sc = new Scanner(System.in);

    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void increaseSalary(double percentage) {
        salario += salario * percentage / 100.0;
    }

    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

}
