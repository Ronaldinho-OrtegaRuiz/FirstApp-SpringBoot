package com.ronal.curso.springboot.webapp.springbootweb.controllers;

import com.ronal.curso.springboot.webapp.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String detail(Model model){
        User user = new User("Ronal", "Ortega", null);
        model.addAttribute("title", "User details");
        model.addAttribute("user", user);
        return "details";
    }
}
