package com.inserta.ejercicio135.repos;

import com.inserta.ejercicio135.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepo  extends JpaRepository<Usuario, Integer> {
    Usuario findByCorreo(String correo);

    List<Usuario> findByCorreoContainingIgnoreCase(String correoParcial);

    List<Usuario> findByNombre(String nombre);

    Usuario findByCorreoAndClave(String correo, String clave);

    boolean existsByCorreoAndClave(String correo, String clave);
}
