package com.example.demo.Controller;
import org.springframework.web.bind.annotation.*;
@restController
public calss basics {
    @GetMapping("/home")
    public String name() {
        return "hello world";
    }
}