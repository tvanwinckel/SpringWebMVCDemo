package com.axxes.helloWorld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/pattern")
public class PatternController {

    @GetMapping("*")
    public String starPattern(final HttpServletRequest request,
                              final Model model) {
        model.addAttribute("pattern", "Star pattern: " + request.getRequestURI());
        return "pattern";
    }

    @GetMapping("**")
    public String doubleStartPattern(final HttpServletRequest request,
                              final Model model) {
        model.addAttribute("pattern", "Double star pattern: " + request.getRequestURI());
        return "pattern";
    }

    @GetMapping("/t?st")
    public String questionMarkPattern(final HttpServletRequest request,
                                      final Model model) {
        model.addAttribute("pattern", "Question mark pattern: " + request.getRequestURI());
        return "pattern";
    }

}
