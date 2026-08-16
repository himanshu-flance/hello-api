package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "This is a test Demo Welcome to Demo Application";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello DevOps!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running";
    }
}