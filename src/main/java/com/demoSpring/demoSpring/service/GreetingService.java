package com.demoSpring.demoSpring.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String sayHello(String name) {
        if ( name == null || name.isBlank() )
            return "Hello!";
        return "Hello, " + name + "!";
    }

}
