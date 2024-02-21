package com.ronal.curso.springboot.webapp.springbootweb.controllers;

import com.ronal.curso.springboot.webapp.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String detail(Model model) {
        User user = new User("Ronal", "Ortega", null);
        model.addAttribute("title", "User details");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {


        model.addAttribute("title", "User list");
        //model.addAttribute("users", users);
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        return Arrays.asList(
                new User("Ronal","Ortega",null),
                new User("John", "Doe",null)
        );

    }
}

