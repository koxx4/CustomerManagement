package com.example.CustomerManagment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
class DummyController{

    @RequestMapping("/hello")
    public String showTeaser(){
        return "hello";
    }

}