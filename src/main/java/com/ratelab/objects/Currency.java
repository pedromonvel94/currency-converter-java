package com.ratelab.objects;

import com.ratelab.utils.PathBuilder;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private String base_code = "";
    private String target_code = "";
    private double conversion_rate;
    private double conversion_result;

    public Currency(String base_code, String target_code, double conversion_rate, double conversion_result) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
        this.conversion_result = conversion_result;
    }

    public Currency(CurrencyExApi currencyExApi) {
        this.base_code = currencyExApi.base_code();
        this.target_code = currencyExApi.target_code();
        this.conversion_rate = currencyExApi.conversion_rate();
        this.conversion_result = currencyExApi.conversion_result();
    }



    @Override
    public String toString() {
        return "Exchange" +
                "From: " + base_code + ", to: " + target_code + "\n" +
                "Conversion rate: " + "\n" +
                "1 " + base_code + " = " + conversion_rate + " " + target_code + "\n" +
                " " + "\n" +
                "Conversion result: " + conversion_result;
    }

}
