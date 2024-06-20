package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    @GetMapping("/login")
    public String longin() {
        return "로그인하라";
    }
    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }
}
