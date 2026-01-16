package com.ratelab.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ratelab.objects.Currency;
import com.ratelab.objects.CurrencyExApi;
import com.ratelab.utils.ApiClient;
import com.ratelab.utils.ConsolePrompts;
import com.ratelab.utils.JsonBuilder;
import com.ratelab.utils.PathBuilder;

import java.io.IOException;

public class RateLab {
    public static void main(String[] args) throws IOException, InterruptedException {
        ConsolePrompts consolePrompts = new ConsolePrompts();

        String path = PathBuilder.buildPath("USD", "EUR", 100);

        System.out.println(path);

        String json = ApiClient.getJson(path);
        System.out.println(json);

        JsonBuilder.parseJson(json);




    }
}
