package serezliev.CryptoConvertor.Services;

import serezliev.CryptoConvertor.Model.CryptoCurrencyModel;

import java.util.List;

public interface ExchangeService {

    List<CryptoCurrencyModel> getAllCryptoCurrencies();
}
