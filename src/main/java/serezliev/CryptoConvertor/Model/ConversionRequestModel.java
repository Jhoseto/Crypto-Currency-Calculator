package serezliev.CryptoConvertor.Model;

public class ConversionRequestModel {

    private String fromCurrency;
    private String toCurrency;
    private double amount;
    private String result;



    public String getFromCurrency() {
        return fromCurrency;
    }

    public ConversionRequestModel setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
        return this;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public ConversionRequestModel setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public ConversionRequestModel setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public String getResult() {
        return result;
    }

    public ConversionRequestModel setResult(String result) {
        this.result = result;
        return this;
    }
}
