package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String home() {
        return "Hello World";
    }
}