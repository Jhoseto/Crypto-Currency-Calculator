package serezliev.CryptoConvertor.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import serezliev.CryptoConvertor.Model.CryptoCurrencyModel;
import serezliev.CryptoConvertor.Services.ExchangeService;

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

}
