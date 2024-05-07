package serezliev.CryptoConvertor.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import serezliev.CryptoConvertor.Model.ConversionRequestModel;
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
