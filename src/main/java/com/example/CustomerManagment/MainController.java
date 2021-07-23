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
    @Qualifier(value = "hibernateCustomerDataAccess")
    CustomerDataAccess customerDataAccess;

    @RequestMapping("/list")
    public String showTeaser(Model model){

        var customers = customerDataAccess.getCustomers(15);
        model.addAttribute("customers", customers);

        return "main-page";
    }

}