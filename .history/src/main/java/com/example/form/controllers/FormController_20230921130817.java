package com.example.form.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.form.models.House;
import com.example.form.models.User;

@Controller
public class FormController {

    @GetMapping("/form")
    public String getMethodName(Map<String, Object> map) {
        map.put("title", "User Form");
        map.put("user", new User());
        return "form";
    }

    @PostMapping("/form")
    public String processForm(User user, Map<String, Object> map) {
        map.put("tilte", "User Form");
        map.put("user", user);
        return "result";
    }

}
