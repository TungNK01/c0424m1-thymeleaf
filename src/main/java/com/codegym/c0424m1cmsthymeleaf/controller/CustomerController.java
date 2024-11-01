package com.codegym.c0424m1cmsthymeleaf.controller;

import com.codegym.c0424m1cmsthymeleaf.service.CustomerServiceImpl;
import com.codegym.c0424m1cmsthymeleaf.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    //private final ICustomerService customerService = new CustomerServiceImpl();

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/list")
    public ModelAndView listCustomers() {
        ModelAndView modelAndView = new ModelAndView("/customers/list");
        modelAndView.addObject("customers", customerService.findAll());
        return modelAndView;
    }
}
