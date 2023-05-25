package com.inserta.ejercicio135.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(HttpSession session){
        if (session.getAttribute("usuario") != null) {
            return "redirect:/index";
        }
        return "login";
    }
}
