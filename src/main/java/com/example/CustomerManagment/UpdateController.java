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

    @PostMapping("showCustomerToModify")
    private String showUpdatableModifiableForm(@RequestParam("customerId") String customerToModifyId, Model model){

        var customerToUpdate = customerService.getCustomerById(
                Integer.parseInt(customerToModifyId));
        assert customerToUpdate != null;

        model.addAttribute("customerToUpdate", customerToUpdate);

        return "updatable-customer-form";
    }

    @PostMapping("modifyCustomer")
    private String modifyCustomer(@Valid @ModelAttribute("customerToUpdate") Customer customer,
                                  BindingResult bindingResult){

        if(bindingResult.hasErrors())
            return "updatable-customer-form";

        customerService.updateCustomer(customer.getId(), customer);
        return "redirect:/customer/list";
    }

    @PostMapping("deleteCustomer")
    private String deleteCustomer(@RequestParam("customerId") String customerToModifyId){
        assert customerToModifyId != null;
        customerService.deleteCustomer(Integer.parseInt(customerToModifyId));

        return "redirect:showUpdatableCustomerList";
    }

}
