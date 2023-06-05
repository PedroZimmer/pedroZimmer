package Aula229_ExercicioFix.model.services;

import Aula229_ExercicioFix.model.entities.Contract;
import Aula229_ExercicioFix.model.entities.Installment;

import java.time.LocalDate;
import java.util.Date;

public class ContractService{



    private OnlinePaymentService onlinePaymentService;
    private Contract contract;
    private Integer months;


    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double amount = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double amountWithInterest = amount + onlinePaymentService.interest(amount, i);
            double fullAmount = amountWithInterest + onlinePaymentService.paymentFee(amountWithInterest);
            LocalDate dataPag = contract.getDate().plusMonths(i);
            contract.setInstallment(new Installment(dataPag, fullAmount, months));
        }


    }
}
