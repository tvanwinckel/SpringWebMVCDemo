package com.axxes.helloWorld.controllers;

import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.TimeUnit;

@Controller
public class CachingController {

    @GetMapping("/cache")
    public ResponseEntity<SimpleObject> cachedObject() {
        final SimpleObject simpleObject = new SimpleObject("someString", 1);
        return ResponseEntity
                .ok()
                .cacheControl(CacheControl.maxAge(30, TimeUnit.MINUTES))
                .eTag("versionIfAvailable")
                .body(simpleObject);
    }
}
