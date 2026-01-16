package main.java.com.ratelab.objects;

import java.util.Map;

public record CurrencyExApi(String base_code, Map<String, Double> rates) {

}
