package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja converter para Fahrenheit (F) ou Celsius (C)?");
        String opcao = scanner.nextLine().trim().toUpperCase();

        if (!opcao.equals("F") && !opcao.equals("C")) {
            System.out.println("Opção inválida. Use apenas F ou C.");
            return;
        }

        System.out.println("Informe o valor da temperatura:");
        double valor = scanner.nextDouble();

        double resultado = 0;
        if (opcao.equals("F")) {
            resultado = celsiusParaFahrenheit(valor);
            System.out.printf("Resultado: %.2f °F\n", resultado);
        } else {
            resultado = fahrenheitParaCelsius(valor);
            System.out.printf("Resultado: %.2f °C\n", resultado);
        }

        scanner.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
