package main.java.com.ratelab.principal;

import main.java.com.ratelab.utils.CurrencyExchange;

public class RateLab {
    public static void main(String[] args) {

        double testCurrency1 = 4.0;
        double testCurrency2 = 2.0;

        double transform = CurrencyExchange.getExchangeRate(testCurrency1, testCurrency2);

        System.out.println("Transformed currency: " + transform);
    }
}
