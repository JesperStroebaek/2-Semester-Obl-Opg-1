package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class controllerGhostform {
    @PostMapping("/ghostform")
    public String ghostform(){ return "ghostform"; }
}
