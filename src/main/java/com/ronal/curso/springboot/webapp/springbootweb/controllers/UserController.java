package com.ronal.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String detail(Model model){
        model.addAttribute("title", "User details");
        model.addAttribute("name", "Ronal");
        model.addAttribute("surname", "Ortega");
        return "details";
    }
}
