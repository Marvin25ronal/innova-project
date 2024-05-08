package com.example.innovaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HealthCheck {
    @GetMapping("/health")
    public String health() {
        return "<h1>Health Check</h1>";
    }
}
