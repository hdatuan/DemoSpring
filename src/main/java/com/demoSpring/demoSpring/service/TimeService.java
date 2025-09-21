package com.demoSpring.demoSpring.service;

import java.time.LocalDateTime;

public class TimeService {

    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }

}
