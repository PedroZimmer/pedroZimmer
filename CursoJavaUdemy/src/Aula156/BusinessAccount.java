package Aula156;

public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); // super() is a call to the superclass constructor
        this.loanLimit = loanLimit;
    }


    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
}
