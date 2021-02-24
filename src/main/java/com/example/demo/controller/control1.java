package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import javax.swing.text.html.HTML;



@Controller
public class control1 {
    @GetMapping("/index")
    public String index(HTML index){ return "index"; }



}
