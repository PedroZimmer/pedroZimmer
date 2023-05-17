package Aula103;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de linhas: ");
        int numLinha = sc.nextInt();
        System.out.println("Informe o número de colunas: ");
        int numColuna = sc.nextInt();
        int[][] mat = new int[numLinha][numColuna];


        for (int i=0; i< mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }


        System.out.println("Informe o número que deseja encontrar: ");
        int num = sc.nextInt();
        Search.search(mat, num);











    }
}
