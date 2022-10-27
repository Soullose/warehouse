package com.sanneng.warehouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {
    
    @GetMapping
    public String home() {
        return "Hello , home!";
    }
    
    @GetMapping("/user")
    public String user(Principal principal) {
        return "Hello , user ! " + principal.getName();
    }
    
    
    @GetMapping("/admin")
    public String admin(Principal principal) {
        return "Hello , admin ! " + principal.getName();
    }
    
}
