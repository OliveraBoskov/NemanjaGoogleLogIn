package com.execom.pomodoro.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class HelloWorld {

    @GetMapping("")
    public String login() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return username;
    }
	
	
}
