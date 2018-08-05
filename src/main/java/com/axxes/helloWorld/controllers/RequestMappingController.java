package com.axxes.helloWorld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/requestmapping")
public class RequestMappingController {

    @PostMapping
    public String postMapping(final Model model) {
        model.addAttribute("message", "post mapping");
        return "requestMapping";
    }

    @RequestMapping(path = "/old-post", method = RequestMethod.POST)
    public String oldPostMapping(final Model model) {
        model.addAttribute("message", "old post mapping");
        return "requestMapping";
    }

    @GetMapping
    public String getMapping(final Model model) {
        model.addAttribute("message", "get mapping");
        return "requestMapping";
    }

    @PutMapping
    public String putMapping(final Model model) {
        model.addAttribute("message", "put mapping");
        return "requestMapping";
    }

    @DeleteMapping
    public String deleteMapping(final Model model) {
        model.addAttribute("message", "delete mapping");
        return "requestMapping";
    }

    @PatchMapping
    public String patchMapping(final Model model) {
        model.addAttribute("message", "patch mapping");
        return "requestMapping";
    }
}
