package serezliev.cryptoConvertor.components;

import com.fasterxml.jackson.databind.JsonNode;
import serezliev.cryptoConvertor.model.CryptoCurrencyModel;

import java.util.ArrayList;
import java.util.List;

public class CryptoCurrencyMapper {

    public static List<CryptoCurrencyModel> mapJsonToCryptoCurrencies(JsonNode jsonNode) {
        List<CryptoCurrencyModel> cryptoCurrencies = new ArrayList<>();
        for (JsonNode node : jsonNode.get("data")) {
            CryptoCurrencyModel cryptoCurrency = new CryptoCurrencyModel();
            cryptoCurrency.setId(node.get("id").asText());
            cryptoCurrency.setRank(node.get("rank").asText());
            cryptoCurrency.setSymbol(node.get("symbol").asText());
            cryptoCurrency.setName(node.get("name").asText());
            cryptoCurrency.setSupply(node.get("supply").asText());
            cryptoCurrency.setMaxSupply(node.get("maxSupply").asText());
            cryptoCurrency.setMarketCapUsd(node.get("marketCapUsd").asText());
            cryptoCurrency.setVolumeUsd24Hr(node.get("volumeUsd24Hr").asText());
            cryptoCurrency.setPriceUsd(node.get("priceUsd").asText());
            cryptoCurrency.setChangePercent24Hr(node.get("changePercent24Hr").asText());
            cryptoCurrency.setVwap24Hr(node.get("vwap24Hr").asText());
            cryptoCurrency.setExplorer(node.get("explorer").asText());
            cryptoCurrencies.add(cryptoCurrency);
        }
        return cryptoCurrencies;
    }
}
