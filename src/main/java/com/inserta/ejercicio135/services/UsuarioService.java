package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.Usuario;

public interface UsuarioService {
    Usuario encontrarUsuario(String correo, String clave);
}
