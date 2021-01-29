package com.example.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {
    @RequestMapping("/swagger")
    public String swagger() {
        return "redirect:/swagger-ui.html";
    }
}
