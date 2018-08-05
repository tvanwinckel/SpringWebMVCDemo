package com.axxes.helloWorld.intercept;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Controller
public class InterceptController extends HandlerInterceptorAdapter {

    private final static Logger LOGGER = LoggerFactory.getLogger(InterceptController.class);

    @GetMapping("/intercept")
    public String intercept(@RequestParam(name="message", required=false, defaultValue = "") final String message, final Model model) {
        LOGGER.info("Entered the intercept method, adding '" + message +"' as message to the model.");
        model.addAttribute("message", message);

        LOGGER.info("Going to return the view.");
        return "intercept";
    }
}
