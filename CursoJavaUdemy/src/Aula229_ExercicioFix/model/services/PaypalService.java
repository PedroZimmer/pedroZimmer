package Aula229_ExercicioFix.model.services;

public class PaypalService implements OnlinePaymentService{

    private static final double PAYMENT_FEE = 0.02; // 2%
    private static final double MONTHLY_INTEREST = 0.01; // 1%

    public double paymentFee(double amount) {
        return amount * PAYMENT_FEE;
    }

    public double interest(double amount, int months) {
        return amount * MONTHLY_INTEREST * months;
    }
}
