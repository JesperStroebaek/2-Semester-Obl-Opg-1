package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerPortfoilo {

    @GetMapping("/portfolio1")

    public String portfolio1() { return "portfolio1"; }
}
