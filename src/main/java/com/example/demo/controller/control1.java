package com.example.demo.controller;

import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class control1 {
    @GetMapping("/")
    public String mainPage(){
        return "mainPage";
    }






}
