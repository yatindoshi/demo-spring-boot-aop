package com.example.aop.controller;

import com.example.aop.annotation.LogExecutionTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    @GetMapping("/time")
    @LogExecutionTime
    public void getExecutionTime() {

    }
}
