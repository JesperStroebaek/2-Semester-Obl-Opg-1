package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.text.html.HTML;

@Controller
public class controllerGhostform {
    @GetMapping("/ghostform")
    public String ghostform(HTML ghostform){
        return ghostform(ghostform);
    }
}
