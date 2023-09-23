package com.example.form.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormController {
    
    @GetMapping("/form")
    public String getMethodName(Map<String, Double> map) {
        return "form";
    }

    @PostMapping("/form")
    public String processForm(Map<String, Double> map) {
        return "result";
    }
    
}
