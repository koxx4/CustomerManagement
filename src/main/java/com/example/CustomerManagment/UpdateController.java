package com.example.CustomerManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer/update")
public class UpdateController {

    @Autowired
    @Qualifier(value = "defaultCustomerService")
    CustomerService customerService;

    @RequestMapping("showUpdatableCustomerList")
    private String showUpdateCustomerPage(Model model){

        var allCustomers = customerService.getAllCustomers();
        model.addAttribute("customers", allCustomers);

        return "updatable-customer-list";
    }

    @PostMapping("showCustomerToUpdate")
    private String showUpdatableCustomerForm(@RequestParam("customerId") String customerToUpdateId, Model model){

        var customerToUpdate = customerService.getCustomerById(
                Integer.parseInt(customerToUpdateId));
        assert customerToUpdate != null;

        model.addAttribute("customerToUpdate", customerToUpdate);

        return "updatable-customer-form";
    }

    @PostMapping("updateCustomer")
    private String updateCustomer(@Valid @ModelAttribute("customerToUpdate") Customer customer,
                                  BindingResult bindingResult){

        if(bindingResult.hasErrors())
            return "updatable-customer-form";

        customerService.updateCustomer(customer.getId(), customer);
        return "redirect:/customer/list";
    }

}
