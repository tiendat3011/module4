package com.example.case2.controller.customer;

import com.example.case2.model.customer.Customer;
import com.example.case2.model.customer.dto.CustomerDto;
import com.example.case2.service.customer.CustomerService;
import com.example.case2.service.customer.CustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    // search và findAll chung 1 method
    @GetMapping("/list-customer")
    public String showListCustomer(@RequestParam(name = "page", defaultValue = "0") int page,
                                   @RequestParam(name = "name", defaultValue = "") String name,
                                   Model model) {
        model.addAttribute("customerList", customerService.findAll(PageRequest.of(page, 5), name));
        model.addAttribute("name", name);
        return "customer/index-customer";
    }

    @GetMapping("/create-customer")
    public String showFormCreate(Model model) {
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        model.addAttribute("customerDto", new CustomerDto());
        return "customer/create-customer";
    }
    @PostMapping("/create-customer")
    public String create(@Valid @ModelAttribute(name = "customerDto") CustomerDto customerDto,
                         BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("customerTypeList", customerTypeService.findAll());
            return "customer/create-customer";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);

        customerService.save(customer);
        return "redirect:/list-customer";
    }
    @GetMapping("/delete-customer/{id}")
    public String showFormDelete(@RequestParam(name = "page", defaultValue = "0") int page,
                                 @RequestParam(name = "name", defaultValue = "") String name,
                                 @PathVariable int id, Model model) {
        customerService.delete(id);
        model.addAttribute("customerList", customerService.findAll(PageRequest.of(page, 5), name));
        return "customer/index-customer";
    }
    @GetMapping("/{id}/update-customer")
    public String showFormUpdate(@PathVariable int id, Model model) {
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        model.addAttribute("customerDto", customerService.findById(id));
        return "customer/update-customer";
    }
    @PostMapping("update-customer")
    public String update(@Valid @ModelAttribute("customerDto") CustomerDto customerDto,
                         BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("customerTypeList", customerTypeService.findAll());
            return "customer/update-customer";
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);

        customerService.save(customer);
        return "redirect:/list-customer";
    }
}
