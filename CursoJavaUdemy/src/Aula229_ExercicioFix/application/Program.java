package Aula229_ExercicioFix.application;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int idContrato = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        String data = sc.next();
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        System.out.println("Entre com o número de parcelas: ");
        int numeroParcelas = sc.nextInt();



    }

}
