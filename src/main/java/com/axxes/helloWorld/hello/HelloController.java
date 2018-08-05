package com.axxes.helloWorld.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String greetings(@RequestParam(name="name", required=false, defaultValue="World") final String name, final Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
