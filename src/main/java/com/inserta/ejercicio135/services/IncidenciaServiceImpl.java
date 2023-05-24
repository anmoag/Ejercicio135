package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.Incidencia;
import com.inserta.ejercicio135.repos.IncidenciaRepo;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class IncidenciaServiceImpl implements IncidenciaService {

    private final IncidenciaRepo incidenciaRepo;

    public IncidenciaServiceImpl(IncidenciaRepo incidenciaRepo) {
        this.incidenciaRepo = incidenciaRepo;
    }

    public List<Incidencia> getAllIncidencias() {
        return incidenciaRepo.findAll();
    }


    public List<Incidencia> getIncidenciasResueltas(boolean resuelta) {
        return incidenciaRepo.findByResueltaTrue();
    }

    public List<Incidencia> getIncidenciasDelAnio(LocalDateTime fechainicio, LocalDateTime fechafinal) {
        return incidenciaRepo.findIncidenciasByFechaBetween(fechainicio, fechafinal);
    }
}
