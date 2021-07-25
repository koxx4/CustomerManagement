package com.example.CustomerManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
class MainController {

    @Autowired
    @Qualifier(value = "defaultCustomerService")
    CustomerService customerService;

    @RequestMapping("/list")
    private String showTeaser(Model model){

        var customers = customerService.getCustomersInverse(10);
        model.addAttribute("customers", customers);

        return "main-page";
    }

    @RequestMapping("/showAddCustomerForm")
    private String showAddCustomerForm(Model model){
        model.addAttribute("newCustomer", new Customer());

        return "add-customer";
    }

    @PostMapping("/addCustomer")
    private String addCustomer(@Valid @ModelAttribute("newCustomer") Customer customerToAdd,
                               BindingResult bindingResult){

        if(bindingResult.hasErrors())
            return "add-customer";

        customerService.saveCustomer(customerToAdd);

        return "redirect:/customer/list";
    }

}