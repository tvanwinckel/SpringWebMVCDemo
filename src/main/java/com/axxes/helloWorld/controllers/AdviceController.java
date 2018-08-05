package com.axxes.helloWorld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdviceController {

    @GetMapping("/advice")
    public String advice(final Model model) {
        return "requestMapping";
    }
}
