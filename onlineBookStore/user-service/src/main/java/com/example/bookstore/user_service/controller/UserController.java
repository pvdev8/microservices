package com.example.bookstore.user_service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {

    @GetMapping("/test/{param}")
    public String getMethodName(@RequestParam String param) {
        return "Hello " + param;
    }
    

}
