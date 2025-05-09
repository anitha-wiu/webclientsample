package com.example.webclientsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class SampleController {

    @GetMapping("/status")
    public String getStatus(){
        return "It works!!";
    }
}
