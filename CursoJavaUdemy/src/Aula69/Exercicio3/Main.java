package Aula69.Exercicio3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1;
        aluno1 = new Aluno();
        aluno1.setNome();
        aluno1.setNotas();
        aluno1.getMedia();
        System.out.println(aluno1.toString());


    }
}
