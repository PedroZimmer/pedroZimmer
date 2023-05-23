package Aula161.entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;
    private List<Employee> Employee = new ArrayList<>();

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double payment() {
        return hours * valuePerHour;
    }

    public String toString(){
        return name + " - $ " + String.format("%.2f", payment());
    }



}
