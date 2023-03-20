package com.zptang.rocket.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IndexController {

    @GetMapping("/home")
    public String home(){
        System.out.println("Hello World");
        return "Welcome to home page!";
    }
}
