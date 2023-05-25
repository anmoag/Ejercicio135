package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.Usuario;
import com.inserta.ejercicio135.services.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public String procesarLogin(
            String correo,
            String clave,
            HttpSession session,
            Model modelo) {
        // Realizo la validación de inicio de sesión aquí
        if (usuarioService.validarUsuario(correo, clave) != null) {
            // Creo un objeto Usuario y lo guardo en la sesión y redirijo al index
            Usuario nuevoUsuario = new Usuario();
            session.setAttribute("nuevoUsuario", nuevoUsuario);
            return "index";
        } else {
            // En caso de error mando un mensaje
            modelo.addAttribute("error", "Usuario y/o contraseña inválidos");
            return "login";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // Elimino el atributo usuarioNuevo de la sesión
        //session.removeAttribute("nuevoUsuario");
        //Cierro toda la sesión y todos los atributos que pudiera haber
        session.invalidate();

        return "/login";
    }
}
