package com.sanneng.warehouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping
    public String jwt(Principal principal) {
        return "Hello,JWT!" + principal.getName();
    }
}
