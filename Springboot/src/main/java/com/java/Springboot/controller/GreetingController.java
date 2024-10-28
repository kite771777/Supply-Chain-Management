package com.java.Springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String greet() {
        return "Hello, welcome to the Spring Boot application!";
    }
}
