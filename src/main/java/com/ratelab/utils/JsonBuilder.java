package com.ratelab.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ratelab.objects.Currency;
import com.ratelab.objects.CurrencyExApi;

public class JsonBuilder {

    public static void parseJson(String json){
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .setPrettyPrinting()
                .create();

        CurrencyExApi currencyExApi = gson.fromJson(json, CurrencyExApi.class);
        Currency currency = new Currency(currencyExApi);
        System.out.println(currency);
    }
}
