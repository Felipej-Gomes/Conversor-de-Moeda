package Alura.ConversorDeMoedas;

import java.util.HashMap;
import java.util.Map;

public class ConversionRates {
    private double EUR;
    private double GBP;
    private double ARS;
    private double BOB;
    private double BRL;
    private double CLP;
    private double COP;
    private double USD;

    // Getters e Setters
    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getGBP() {
        return GBP;
    }

    public void setGBP(double GBP) {
        this.GBP = GBP;
    }

    public double getARS() {
        return ARS;
    }

    public void setARS(double ARS) {
        this.ARS = ARS;
    }

    public double getBOB() {
        return BOB;
    }

    public void setBOB(double BOB) {
        this.BOB = BOB;
    }

    public double getBRL() {
        return BRL;
    }

    public void setBRL(double BRL) {
        this.BRL = BRL;
    }

    public double getCLP() {
        return CLP;
    }

    public void setCLP(double CLP) {
        this.CLP = CLP;
    }

    public double getCOP() {
        return COP;
    }

    public void setCOP(double COP) {
        this.COP = COP;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    // Método para retornar todas as taxas em um Map
    public Map<String, Double> getRates() {
        Map<String, Double> rates = new HashMap<>();
        rates.put("EUR", EUR);
        rates.put("GBP", GBP);
        rates.put("ARS", ARS);
        rates.put("BOB", BOB);
        rates.put("BRL", BRL);
        rates.put("CLP", CLP);
        rates.put("COP", COP);
        rates.put("USD", USD);
        return rates;
    }
}
