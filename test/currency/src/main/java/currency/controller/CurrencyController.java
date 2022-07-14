package currency.controller;

import currency.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    @Autowired
    private ICurrencyService iCurrencyService;

    @GetMapping("")
    public String showList() {
        return "list";
    }

    @PostMapping()
    public String current(@RequestParam(name = "USD" , defaultValue = "0") String usd, Model model) {

        model.addAttribute("result", iCurrencyService.curent(usd));
        model.addAttribute("usd", usd);
        return "list";
    }
}