package com.cybersoft.demoSpring.controller;

import com.cybersoft.demoSpring.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 *  Declare path
 * @Controller : declare path, return html
 * @ResponseBody : declare path, return String ( json, xml )
 *
 * @RestController : declare path, return String ( json, xml )
 * @RequestMapping : declare path
 *
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final User user;

    public HelloController(User user){
        this.user = user;
    }

    @GetMapping("")
    public String hello() {
        return "Hello Spring Boot " + user.getName();
    }

    @GetMapping("/bc10")
    public String helloBc10() {
        return "Hello bc 10";
    }




}
