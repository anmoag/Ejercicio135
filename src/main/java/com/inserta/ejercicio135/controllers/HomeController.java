package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(@SessionAttribute(required = false) Usuario nuevoUsuario){
        if (nuevoUsuario == null) {
            return "login";
        }
        return "index";
    }
}
