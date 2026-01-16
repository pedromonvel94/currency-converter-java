package main.java.com.ratelab.utils;

public class PathBuilder {

    static String baseUrl = "https://v6.exchangerate-api.com/v6/";
    static String apiKey = "34851442b06a9829918ce42c";
    static String endpoint = "/latest/";

    public static String buildPath(String fromCurrency, String toCurrency, String amount) {
        return baseUrl + apiKey + endpoint + fromCurrency + "/" + toCurrency + "/" + amount;
    }
}