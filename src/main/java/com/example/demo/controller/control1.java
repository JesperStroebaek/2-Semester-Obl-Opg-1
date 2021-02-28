package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class control1 {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/ghostform")
    public String ghostform(){return "ghostform";}



}




