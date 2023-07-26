package com.example.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome";
    }


    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/account")
    public String getAccount(){
        return "Account";
    }
}
