package serezliev.CryptoConvertor.Services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import serezliev.CryptoConvertor.Components.CryptoCurrencyMapper;
import serezliev.CryptoConvertor.Model.CryptoCurrencyModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExchangeServiceImpl implements ExchangeService {

    private static final String API_URL = "https://api.coincap.io/v2";
    private static final String API_KEY = "377e21a0-5222-4b4b-b097-dfe5bb556475";

    @Override
    public List<CryptoCurrencyModel> getAllCryptoCurrencies() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Request request = new Request.Builder()
                .url(API_URL + "/assets")
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String responseBody = response.body().string();
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(responseBody);
                return CryptoCurrencyMapper.mapJsonToCryptoCurrencies(jsonNode);
            } else {
                System.err.println("Request failed with code: " + response.code());
                return new ArrayList<>();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
