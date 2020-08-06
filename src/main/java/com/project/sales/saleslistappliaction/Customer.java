package com.project.sales.saleslistappliaction;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Customer {

    @RequestMapping("/")
    public ModelAndView home(){

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Spring MVC -> HELLO!");
        return modelAndView;
    }

}
