package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.Incidencia;
import java.time.LocalDateTime;
import java.util.List;

public interface IncidenciaService {

    List<Incidencia> getAllIncidencias();

    List<Incidencia> getIncidenciasResueltas(boolean resuelta);
    List<Incidencia> getIncidenciasDelAnio(LocalDateTime fechainicio, LocalDateTime fechafinal);
}
