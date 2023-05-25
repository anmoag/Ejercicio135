package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.Usuario;

public interface UsuarioService {
    boolean validarUsuario(String correo, String clave);
}
