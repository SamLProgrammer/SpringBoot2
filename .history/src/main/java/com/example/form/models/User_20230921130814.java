package com.example.form.models;

import org.springframework.validation.BindingResult;

public class User {

    private String userName;
    private String email;
    private String password;

    public User() {
        
    }

    public User(String userName, BindingResult bind, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
