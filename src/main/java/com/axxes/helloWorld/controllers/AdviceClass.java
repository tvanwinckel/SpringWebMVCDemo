package com.axxes.helloWorld.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice(assignableTypes = AdviceController.class)
public class AdviceClass {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdviceClass.class);

    @ModelAttribute
    public void globalAttribute(final Model model) {
        LOGGER.info("I was called to do something when the AdviceController was triggered.");
        model.addAttribute("message", "Advice");
    }
}
