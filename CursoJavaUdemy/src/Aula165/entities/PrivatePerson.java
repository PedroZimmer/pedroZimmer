package Aula165.entities;

public class PrivatePerson extends Person{

    private Double healthExpenditures;

    public PrivatePerson() {
        super();
    }

    public PrivatePerson(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if(getAnnualIncome() < 20000.0){
            return getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
        }else{
            return getAnnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}
