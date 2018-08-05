package com.axxes.helloWorld.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceController {

    @GetMapping(path = "/produce", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public SimpleObject getSimpleObject() {
        return new SimpleObject("someString", 1);
    }
}
