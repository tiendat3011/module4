package com.example.smart_phone.controller;

import com.example.smart_phone.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/smartphones")
public class HomeController {
    @Autowired
    private SmartPhoneService smartPhoneService;

    @GetMapping("/list")
    public String getAllSmartphonePage(Model model) {
        model.addAttribute("smartphones", smartPhoneService.findAll());
        return "list";
    }
}
