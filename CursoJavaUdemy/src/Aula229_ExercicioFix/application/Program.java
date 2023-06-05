package Aula229_ExercicioFix.application;

import Aula229_ExercicioFix.model.entities.Contract;
import Aula229_ExercicioFix.model.entities.Installment;
import Aula229_ExercicioFix.model.services.ContractService;
import Aula229_ExercicioFix.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int idContrato = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), dataFormatter);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        System.out.println("Entre com o número de parcelas: ");
        int numeroParcelas = sc.nextInt();


        Contract contract = new Contract(idContrato, data, totalValue);

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, numeroParcelas);


        System.out.println("Parcelas: ");
        for (Installment x : contract.getInstallment()) {
            System.out.println(x);
        }





    }

}
