package serezliev.cryptoConvertor.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import serezliev.cryptoConvertor.model.ConversionRequestModel;
import serezliev.cryptoConvertor.model.CryptoCurrencyModel;
import serezliev.cryptoConvertor.services.ExchangeService;

import java.util.List;

@Controller
public class ExchangeController {

    private final ExchangeService exchangeService;

    @Autowired
    public ExchangeController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }


    @GetMapping("/")
    public String redirectToIndex(Model model) {
        List<CryptoCurrencyModel> cryptoCurrencyModel = exchangeService.getAllCryptoCurrencies();

        model.addAttribute("allCurrency", cryptoCurrencyModel);
        return "index";
    }


    @PostMapping("/convert")
    public String convertCurrency(ConversionRequestModel request,
                                  Model model) {
        String result = exchangeService.convertCurrency(
                request.getFromCurrency(),
                request.getToCurrency(),
                request.getAmount());
        request.setResult(result);
        List<CryptoCurrencyModel> cryptoCurrencyModel = exchangeService.getAllCryptoCurrencies();

        model.addAttribute("allCurrency", cryptoCurrencyModel);
        model.addAttribute("conversionRequest", request.getResult());
        return "index";
    }

}
