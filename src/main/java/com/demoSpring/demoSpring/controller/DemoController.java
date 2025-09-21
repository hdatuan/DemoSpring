package com.demoSpring.demoSpring.controller;

import com.demoSpring.demoSpring.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Qualifier("Nguyen Van A")

    private User user;


    @GetMapping
    public String demo(){
        return "Demo " + user.getName();
    }


}
