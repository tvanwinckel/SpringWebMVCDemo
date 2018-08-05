package com.axxes.helloWorld.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ConsumerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerController.class);

    @PostMapping(path = "/consume", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String consumes(@RequestBody final SimpleObject simpleObject) {
        LOGGER.info(simpleObject.toString());
        return "requestMapping";
    }
}
