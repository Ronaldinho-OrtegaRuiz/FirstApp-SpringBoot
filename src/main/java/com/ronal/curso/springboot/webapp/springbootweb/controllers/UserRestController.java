package com.ronal.curso.springboot.webapp.springbootweb.controllers;

import com.ronal.curso.springboot.webapp.springbootweb.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> detail(){
        User user = new User("Ronal", "Ortega");
        Map<String, Object> response = new HashMap<>();
        response.put("title", "User Details");
        response.put("user", user);
        return response;
    }
}
