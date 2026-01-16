package main.java.com.ratelab.objects;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    public String base_code;
    public Map<String, Double> rates = new HashMap<>();

    public Currency(String base_code, Map<String, Double> rates) {
        this.base_code = base_code;
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Exchange" +
                "From'" + base_code + '\'' +
                ", to: " + rates +
                '}';
    }

}
