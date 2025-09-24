package com.demoSpring.demoSpring.controller;

import com.demoSpring.demoSpring.entity.User;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/hello")
public class HelloController {

    private final User user;

    public HelloController(User user){
        this.user = user;
    }

    @GetMapping("")
    public String hello() {
        return "Hello Spring Boot!";
    }




}
