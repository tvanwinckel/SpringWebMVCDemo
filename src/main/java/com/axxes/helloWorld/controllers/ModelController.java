package com.axxes.helloWorld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class ModelController {

    @GetMapping("/model")
    public String model(final Model model) {
        model.addAttribute("message", "modelAttribute");
        return "modelView";
    }

    @GetMapping("/modelWithMap")
    public String modelWithMap(final Model model) {
        final HashMap<String, String> map = new HashMap<>();
        map.put("message", "modelWithMap");
        model.mergeAttributes(map);
        return "modelView";
    }

    @GetMapping("/modelMap")
    public String modelMap(final ModelMap modelMap) {
        modelMap.addAttribute("message", "modelMap");
        return "modelView";
    }

    @GetMapping("/modelAndView")
    public ModelAndView modelAndView() {
        final ModelAndView modelView = new ModelAndView("modelView");
        modelView.addObject("message", "modelAndView");
        return modelView;
    }
}
