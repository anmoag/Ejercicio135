package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.Usuario;
import com.inserta.ejercicio135.services.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public String procesarLogin(
            @RequestParam String correo,
            @RequestParam String clave,
            HttpSession session,
            Model modelo) {
        // Realiza la validación de inicio de sesión aquí
        if (usuarioService.validarUsuario(correo, clave)) {
            // Crea un objeto Usuario y guárdalo en la sesión
            Usuario nuevousuario = new Usuario();
            session.setAttribute("usuario", nuevousuario);
            return "index";
        } else {
            modelo.addAttribute("error", "Usuario y/o contraseña inválidos");
            return "login";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // Elimina el objeto Usuario de la sesión y redirige al inicio de sesión
        session.removeAttribute("usuario");
        return "/login";
    }
}
