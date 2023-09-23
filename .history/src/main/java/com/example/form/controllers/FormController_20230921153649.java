package com.example.form.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.form.models.User;

@Controller
@SessionAttributes("user")
public class FormController {

    @GetMapping("/form")
    public String getMethodName(Map<String, Object> map) {
        map.put("title", "User Form");
        map.put("user", new User());
        return "form";
    }

    @PostMapping("/form")
    public String processForm(User user, Map<String, Object> map, SessionStatus sessionStatus) {
        map.put("tilte", "User Form");
        map.put("user", user);
        sessionStatus.setComplete();
        return "result";
    }

}
