package com.ratelab.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsolePrompts {
    Scanner scanner = new Scanner(System.in);

    public String showWelcomeMessage() {
        System.out.println("Bienvenido a RateLab! Tu asistente de conversion de monedas.");
        System.out.println("-----------------------------------------------");
        return "";
    }

    public long askingAmount (){
        while (true) {
            try {
                System.out.println("Escribe la cantidad que deseas convertir: ");
                long amount = scanner.nextLong();
                scanner.nextLine();
                return amount;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingresa un número válido.");
                scanner.nextLine();
            }
        }
    }

    public String askingFromCurrency () {
        System.out.println("Escribe la moneda base para la conversion, por ejemplo: \n" +
                "USD - Dolar Estadounidense\n" +
                "EUR - Euro\n" +
                "GBP - Libra Esterlina\n" +
                "JPY - Yen Japones\n" +
                "AUD - Dolar Australiano\n" +
                "CAD - Dolar Canadiense\n" +
                "CHF - Franco Suizo\n" +
                "COP - Peso Colombiano\n" +
                "MXN - Peso Mexicano\n" +
                "ARS - Peso Argentino\n" +
                "CNY - Yuan Chino");
        return scanner.nextLine().toUpperCase();
    }

    public String askingToCurrency () {
        System.out.println("Escribe la moneda a la que deseas convertir, por ejemplo: \n" +
                "USD - Dolar Estadounidense\n" +
                "EUR - Euro\n" +
                "GBP - Libra Esterlina\n" +
                "JPY - Yen Japones\n" +
                "AUD - Dolar Australiano\n" +
                "CAD - Dolar Canadiense\n" +
                "CHF - Franco Suizo\n" +
                "COP - Peso Colombiano\n" +
                "MXN - Peso Mexicano\n" +
                "ARS - Peso Argentino\n" +
                "CNY - Yuan Chino");
        return scanner.nextLine().toUpperCase();

    }

}
