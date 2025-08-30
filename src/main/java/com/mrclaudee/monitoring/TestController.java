package com.mrclaudee.monitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/monitor")
    public String hello() {
        return "Hello, World!";
    }
}
