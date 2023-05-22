package Aula157.application;

import Aula157.entities.Account;
import Aula157.entities.BusinessAccount;
import Aula157.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {


        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);


        // UPCASTING

        Account acc1 = bacc; // BusinessAccount is a subclass of Account | Polymorphism
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0); // BusinessAccount is a subclass of Account
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.0); // SavingsAccount is a subclass of Account

        // DOWNCASTING


        BusinessAccount acc4= (BusinessAccount) acc2; // acc2 is a BusinessAccount
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3; // acc3 is a SavingsAccount
        if (acc3 instanceof BusinessAccount) { // acc3 is a SavingsAccount
            BusinessAccount acc5 = (BusinessAccount) acc3; // acc3 is a SavingsAccount
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) { // acc3 is a SavingsAccount
            SavingsAccount acc5 = (SavingsAccount) acc3; // acc3 is a SavingsAccount
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }



}
