package com.example.form.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormController {
    
    @GetMapping("/form")
    public String getMethodName(Map<String, Object> map) {
        map.put("tilte", "User Form");
        return "form";
    }

    @PostMapping("/form")
    public String processForm(  @RequestParam("username") String name, 
                                @RequestParam("password") String password, 
                                @RequestParam("email") String email, 
                                Map<String, Object> map ) {

        map.put("username", name);
        map.put("email", email);
        map.put("password", password);
        return "result";
    }
    
}
