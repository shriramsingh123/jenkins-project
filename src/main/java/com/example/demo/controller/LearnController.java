package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnController {


    @GetMapping("/test")
    public String test(){
        return "Job Running Successfully";
    }
}
