package com.mongodb.notes.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping
    public String sendHomePage() {
        return "index.html";
    }
}
