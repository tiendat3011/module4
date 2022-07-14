package caculator.controller;

import caculator.service.CalculatorService;
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
    public String calculator(@RequestParam("num1") double num1,
                             @RequestParam("num2") double num2,
                             @RequestParam("check") char check,
                             Model model) {

        model.addAttribute("result", calculatorService.calculator(num1, num2, check));
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);

        return "list";
    }
}