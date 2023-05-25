package com.inserta.ejercicio135.services;


import com.inserta.ejercicio135.repos.UsuarioRepo;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    private final UsuarioRepo usuarioRepo;

    public UsuarioServiceImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    @Override
    public boolean validarUsuario(String correo, String clave) {
        return usuarioRepo.existsByCorreoAndClave(correo, clave);
    }
}
