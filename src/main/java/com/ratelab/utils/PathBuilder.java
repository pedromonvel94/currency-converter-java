package com.ratelab.utils;

import com.ratelab.config.AppConfig;

public class PathBuilder {

    private static String baseUrl = "https://v6.exchangerate-api.com/v6/";
    private static String endpoint = "/pair/";

    public static String buildPath(String fromCurrency, String toCurrency, long amount) {
        String apiKey = AppConfig.getExchangeRateApiKey();
        return baseUrl + apiKey + endpoint + fromCurrency + "/" + toCurrency + "/" + amount;
    }
}