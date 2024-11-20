package Alura.ConversorDeMoedas;

import com.google.gson.Gson;
import java.util.Map;
import java.util.Scanner;

public class FiltrarMoedas {
    public static void main(String[] args) {
        // Exemplo de JSON da API (simulado)
        String jsonResponse = "{\n" +
            "    \"result\": \"success\",\n" +
            "    \"base_code\": \"USD\",\n" +
            "    \"conversion_rates\": {\n" +
            "        \"ARS\": 350.5,\n" +
            "        \"BOB\": 6.91,\n" +
            "        \"BRL\": 5.3,\n" +
            "        \"CLP\": 890.0,\n" +
            "        \"COP\": 4150.2,\n" +
            "        \"USD\": 1.0\n" +
            "    }\n" +
        "}";

        // Desserializando o JSON em ApiResponse
        Gson gson = new Gson();
        ApiResponse response = gson.fromJson(jsonResponse, ApiResponse.class);

        // Obter as taxas de câmbio
        Map<String, Double> taxas = response.getConversion_rates().getRates();

        // Scanner para obter entradas do usuário
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            // Exibir o menu
            System.out.println("Escolha uma opção de conversão:");
            System.out.println("1 - Converter Moeda");
            System.out.println("2 - Sair");
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Solicitar valor e moedas ao usuário
                    System.out.println("Digite o valor a ser convertido:");
                    double valor = scanner.nextDouble();

                    System.out.println("Digite a moeda de origem (ex: USD, BRL, ARS):");
                    String moedaOrigem = scanner.next().toUpperCase();

                    System.out.println("Digite a moeda de destino (ex: USD, BRL, ARS):");
                    String moedaDestino = scanner.next().toUpperCase();

                    // Realizar a conversão
                    double resultado = realizarConversao(valor, moedaOrigem, moedaDestino, taxas);

                    // Exibir o resultado da conversão
                    if (resultado != -1) {
                        System.out.println("O valor convertido de " + moedaOrigem + " para " + moedaDestino + " é: " + resultado);
                    } else {
                        System.out.println("Erro na conversão. Verifique as moedas inseridas.");
                    }
                    break;

                case 2:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 2); // O loop continuará até o usuário escolher sair
    }

    // Método para realizar a conversão de uma moeda para outra
    public static double realizarConversao(double valor, String moedaOrigem, String moedaDestino, Map<String, Double> taxas) {
        // Obter as taxas de origem e destino
        Double taxaOrigem = taxas.get(moedaOrigem);
        Double taxaDestino = taxas.get(moedaDestino);

        if (taxaOrigem == null || taxaDestino == null) {
            System.out.println("Moeda não encontrada!");
            return -1;
        }

        // Converter o valor com base nas taxas
        double valorEmBase = valor / taxaOrigem; // Converte para a moeda base (USD, no exemplo)
        double valorConvertido = valorEmBase * taxaDestino; // Converte para a moeda destino

        return valorConvertido;
    }
}
