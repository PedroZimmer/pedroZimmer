package Aula163_Abstract.application;

import Aula163_Abstract.entities.Account;
import Aula163_Abstract.entities.BusinessAccount;
import Aula163_Abstract.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;


public class Program {

    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
        list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.00, 500.00));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }

        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }




    }
}