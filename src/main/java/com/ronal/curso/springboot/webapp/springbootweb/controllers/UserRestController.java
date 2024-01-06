package com.ronal.curso.springboot.webapp.springbootweb.controllers;

import com.ronal.curso.springboot.webapp.springbootweb.models.User;
import com.ronal.curso.springboot.webapp.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        User user = new User("Ronal", "Ortega", "b99ronal@gmail.com");
        UserDto userDto = new UserDto();
        userDto.setTitle("User Details");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/list")
    public List<User> List() {
        User user = new User("Ronal", "Ortega", "b99ronal@gmail.com");
        User user2 = new User("Ronal", "Ortega","b99ronal@gmail.com");
        User user3 = new User("Ronal", "Ortega","b99ronal@gmail.com");

        return Arrays.asList(user, user2, user3);
    }


    @GetMapping("/detailsMap")
    public Map<String, Object> detailMap() {
        User user = new User("Ronal", "Ortega", "b99ronal@gmail.com");
        Map<String, Object> response = new HashMap<>();
        response.put("title", "User Details");
        response.put("user", user);
        return response;
    }
}
