package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import javax.swing.text.html.HTML;



@Controller
public class control1 {
    @GetMapping("/")
    public String mainPage(){
        return "mainPage";
    }


    @GetMapping("/ghost")
    public String ghostform(HTML ghostform){ return "ghostform"; }



}
