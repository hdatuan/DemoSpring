package com.demoSpring.demoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SumController {

    @GetMapping("/sum")
    public String sum(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        return (a + b) + "";
    }

}
