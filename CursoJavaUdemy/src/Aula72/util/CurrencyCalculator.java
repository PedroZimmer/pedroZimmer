package Aula72.util;

public class CurrencyCalculator {

    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double amount){
        return dollarPrice * amount * (1.0 + IOF);
    }



}
