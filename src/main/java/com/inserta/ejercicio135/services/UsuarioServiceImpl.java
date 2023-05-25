package com.inserta.ejercicio135.services;


import com.inserta.ejercicio135.models.Usuario;
import com.inserta.ejercicio135.repos.UsuarioRepo;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    private final UsuarioRepo usuarioRepo;

    public UsuarioServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public Usuario encontrarUsuario(String correo, String clave) {
        return usuarioRepo.findByCorreoAndClave(correo, clave);
    }
}
