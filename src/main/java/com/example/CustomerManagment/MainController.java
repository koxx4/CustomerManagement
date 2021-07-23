package com.example.CustomerManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
class MainController {

    @Autowired
    @Qualifier(value = "defaultCustomerService")
    CustomerService customerService;

    @RequestMapping("/list")
    public String showTeaser(Model model){

        var customers = customerService.getCustomers(15);
        model.addAttribute("customers", customers);

        return "main-page";
    }

    @RequestMapping("/addCustomer")
    public String addCustomer(){
        return "add-customer";
    }



}