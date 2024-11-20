package Alura.ConversorDeMoedas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

import com.google.gson.Gson;

public class ExchangeRateAPI {
	
    public static void main(String[] args) {
        try {
            // Substitua pela sua chave da API
            String apiKey = "a52ca104b5dbebc4affc764a";
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

            // Criando o cliente HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            
        

            // Fazendo a solicitação e obtendo a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Convertendo a resposta para JSON
            JSONObject jsonResponse = new JSONObject(response.body());

            // Verificando o resultado e extraindo as taxas de câmbio
            if (jsonResponse.getString("result").equals("success")) {
                JSONObject rates = jsonResponse.getJSONObject("conversion_rates");
                System.out.println("Taxa de EUR: " + rates.getDouble("EUR"));
                System.out.println("Taxa de GBP: " + rates.getDouble("GBP"));
            } else {
                System.out.println("Erro ao obter as taxas de câmbio.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
