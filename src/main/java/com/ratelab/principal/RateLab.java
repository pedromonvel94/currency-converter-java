package com.ratelab.principal;

import com.ratelab.utils.ApiClient;
import com.ratelab.utils.ConsolePrompts;
import com.ratelab.utils.JsonBuilder;
import com.ratelab.utils.PathBuilder;

import java.io.IOException;
import java.util.Scanner;

public class RateLab {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean userFlow = true;
        ConsolePrompts consolePrompts = new ConsolePrompts();
        Scanner scanner = new Scanner(System.in);
        String baseCurrency = "";
        String targetCurrency = "";
        long amount = 0;

        consolePrompts.showWelcomeMessage();

        while (userFlow){

            System.out.println("Deseas realizar una conversion de moneda? (Yes/No) o escribe 'exit' para salir: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")){
                System.out.println("Gracias por usar RateLab. ¡Hasta luego!");
                userFlow = false;
            }

            if (userInput.equalsIgnoreCase("yes")){
                //Pregunto de cual moneda quiere convertir
                baseCurrency = consolePrompts.askingFromCurrency();

                //Pregunto a cual moneda quiere convertir
                targetCurrency = consolePrompts.askingToCurrency();

                //Pregunto la cantidad a convertir
                amount = consolePrompts.askingAmount();

            } else if (userInput.equalsIgnoreCase("no")){
                System.out.println("Gracias por usar RateLab. ¡Hasta luego!");
                userFlow = false;
            } else {
                System.out.println("Entrada no valida. Por favor escribe 'Yes', 'No' o 'exit'.");
            }

            String path = PathBuilder.buildPath(baseCurrency, targetCurrency, amount);
            String json = ApiClient.getJson(path);
            JsonBuilder.parseJson(json);
        }
    }
}
