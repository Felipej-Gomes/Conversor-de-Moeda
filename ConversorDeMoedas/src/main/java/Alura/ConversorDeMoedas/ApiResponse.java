package Alura.ConversorDeMoedas;

public class ApiResponse {
    private String result;
    private String base_code;
    private ConversionRates conversion_rates;

    // Getters e Setters
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public ConversionRates getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(ConversionRates conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}