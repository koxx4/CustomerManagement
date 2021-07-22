package com.example.CustomerManagment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
class DummyController{

    @RequestMapping("/teaser")
    public String showTeaser(){
        return "hello";
    }

}