package Aula229_ExercicioFix.model.entities;

import java.time.LocalDate;
import java.util.Date;

public class Installment {

    private LocalDate dueDate;
    private Double amount;

    private Integer months;

    public Installment() {
    }

    public Installment(LocalDate dueDate, Double amount, Integer months) {
        this.dueDate = dueDate;
        this.amount = amount;
        this.months = months;

    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public String toString(){
        return dueDate + " - " + amount;
    }
}


