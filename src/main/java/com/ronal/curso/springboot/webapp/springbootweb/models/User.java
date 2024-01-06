package com.ronal.curso.springboot.webapp.springbootweb.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private String email;
}