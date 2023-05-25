package com.inserta.ejercicio135.repos;

import com.inserta.ejercicio135.models.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "tipos")
public interface TipoRepo extends JpaRepository<Tipo,Integer> {
}
