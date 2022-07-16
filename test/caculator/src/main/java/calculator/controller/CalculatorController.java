package calculator.controller;

import calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("")
    public String showList() {
        return "list";
    }

    @PostMapping("/calculator")
    public String calculator(@RequestParam(value = "num1", defaultValue = "0") String num1,
                             @RequestParam(value = "num2", defaultValue = "1") String num2,
                             @RequestParam("check") char check,
                             Model model) {
        model.addAttribute("result", calculatorService.calculator(num1, num2, check));
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        return "list";
    }
}
