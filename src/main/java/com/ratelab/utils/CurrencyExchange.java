package main.java.com.ratelab.utils;

public class CurrencyExchange {

    private CurrencyExchange() {

    }

    public static double getExchangeRate(double fromCurrency, double toCurrency) {
        return fromCurrency * toCurrency;
    }
}
