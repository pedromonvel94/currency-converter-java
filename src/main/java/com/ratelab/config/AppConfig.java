package com.ratelab.config;

import io.github.cdimascio.dotenv.Dotenv;

public final class AppConfig {

    private static final Dotenv dotenv = Dotenv.configure()
            .ignoreIfMissing()
            .load();

    private AppConfig() {

    }

    public static String getExchangeRateApiKey() {
        String key = System.getenv("EXCHANGE_RATE_API_KEY");

        if (key == null || key.isBlank()) {
            key = dotenv.get("EXCHANGE_RATE_API_KEY");
        }

        if (key == null || key.isBlank()) {
            throw new IllegalStateException(
                    "Missing EXCHANGE_RATE_API_KEY. Define it as an environment variable or in a .env file."
            );
        }

        return key.trim();
    }
}

