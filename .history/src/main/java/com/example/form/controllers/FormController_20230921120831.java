package com.example.form.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.form.models.House;
import com.example.form.models.User;

import jakarta.validation.Valid;

@Controller
public class FormController {

    @GetMapping("/form")
    public String getMethodName(Map<String, Object> map) {
        map.put("tilte", "User Form");
        return "form";
    }

    @PostMapping("/form")
    public String processForm(@Valid User user, BindingResult result,
                              House house, Map<String, Object> map) {
        map.put("tilte", "User Form");
        if(result.hasErrors()) {
            return "form";
        }

        map.put("user", user);
        map.put("house", house);
        return "result";
    }

}
