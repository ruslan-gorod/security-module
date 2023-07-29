package com.epam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class InfoController {

    private final String[] stats = {
            "MVC APPLICATION",
            "Spring Boot Project",
            "RESTful API",
            "Java Application"
    };

    @GetMapping("/info")
    public String getInfo() {
        int randomIndex = new Random().nextInt(stats.length);
        return stats[randomIndex];
    }
}

