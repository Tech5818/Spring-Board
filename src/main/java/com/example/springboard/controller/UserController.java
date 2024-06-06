package com.example.springboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("email") String email, Model model) {

        return "success";
    }
}
