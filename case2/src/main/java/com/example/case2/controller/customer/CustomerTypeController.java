package com.example.case2.controller.customer;

import com.example.case2.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerTypeController {
    @Autowired
    private CustomerTypeService customerTypeService;

}
