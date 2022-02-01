package com.example.tqh;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @CrossOrigin
    @GetMapping("/")
    public String sayEmpty() {
        return "Hi back slash";
    }

    @CrossOrigin
    @GetMapping("/hello")
    public String sayHello() {
        return "Hi";
    }

    @GetMapping("/object")
    public Object sayObject() {
        return "Hi i am an object";
    }
}