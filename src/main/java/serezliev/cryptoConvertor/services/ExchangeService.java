package serezliev.cryptoConvertor.services;

import serezliev.cryptoConvertor.model.CryptoCurrencyModel;

import java.util.List;

public interface ExchangeService {

    List<CryptoCurrencyModel> getAllCryptoCurrencies();

    String convertCurrency(String fromCurrency, String toCurrency, double amount);
}
