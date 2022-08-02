package com.example.blog_ajax.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

//    @GetMapping
//    public String ShowHome() {
//        return "list";
//    }

    @GetMapping("/login")
    public String ShowLogin() {
        return "home_page/home";
    }
}