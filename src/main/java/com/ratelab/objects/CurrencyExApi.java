package com.ratelab.objects;

public record CurrencyExApi(String base_code, String target_code, double conversion_rate, double conversion_result) {

}
