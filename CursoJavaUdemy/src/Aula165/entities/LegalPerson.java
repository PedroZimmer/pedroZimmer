package Aula165.entities;

public class LegalPerson extends Person{

    private Integer numberOfEmployees;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        if(numberOfEmployees > 0){
            this.numberOfEmployees = numberOfEmployees;
        }
    }

    @Override
    public Double tax() {
        if(numberOfEmployees > 10){
            return getAnnualIncome() * 0.14;
        }else{
            return getAnnualIncome() * 0.16;
        }
    }

}
