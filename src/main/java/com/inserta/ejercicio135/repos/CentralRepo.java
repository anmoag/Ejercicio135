package com.inserta.ejercicio135.repos;

import com.inserta.ejercicio135.models.Central;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;


@Repository
@RepositoryRestResource(path = "centrales")
public interface CentralRepo extends JpaRepository<Central, Integer> {
    List<Central> findByActiva(boolean activa);
    List<Central> findByIdTipo(int idTipo);
    List<Central> findByInicioBefore(LocalDateTime fecha);
}


