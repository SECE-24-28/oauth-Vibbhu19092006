package com.example.OAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/public")
    public String login() {
        return "Authenticated";
    }
    @GetMapping("/private")
    public String privateLogin() {
        return "Authorized and Authenticated ";
    }

}
