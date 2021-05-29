package com.devdhaine.springsecurityjwt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author: dev_Dhaine
 *@Date: May-2021
 */

@RestController
public class GreetingController {

    @GetMapping("/sayGreeting")
    public String sayGreeting(){
        return "HI";
    }
}
