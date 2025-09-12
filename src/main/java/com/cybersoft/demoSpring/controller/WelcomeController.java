package com.cybersoft.demoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome/{username}")
    public String welcome(@PathVariable String username, @RequestParam(defaultValue = "en") String lang) {
        if ( lang.equalsIgnoreCase("en") ) {
            return "Hello, " + username;
        }
        else if ( lang.equalsIgnoreCase("vi") ) {
            return "Xin chào, " + username;
        } else {
            return "Unsupported language: " + lang;
        }
    }
}
