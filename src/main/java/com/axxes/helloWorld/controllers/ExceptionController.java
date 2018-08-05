package com.axxes.helloWorld.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionController.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAll(final Exception e) {
        return new ResponseEntity<>("A general error occured", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<String> handleSpecific(final Exception e) {
        return new ResponseEntity<>("A specific error occured", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/illegalException")
    public String illegalException(final Model model) {
        throw new IllegalStateException();
    }

    @GetMapping("/exception")
    public String exception(final Model model) throws Exception {
        throw new Exception();
    }
}
