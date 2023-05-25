package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.Central;
import com.inserta.ejercicio135.models.Tipo;
import com.inserta.ejercicio135.repos.CentralRepo;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CentralServiceImpl implements CentralService{

    private final CentralRepo centralRepo;

    public CentralServiceImpl(CentralRepo centralRepo) {
        this.centralRepo = centralRepo;
    }

    public List<Central> mostrarCentrales() {
        return centralRepo.findAll();
    }

    public List<Central> mostrarCentralesActivas(boolean activa) {
        return centralRepo.findByActiva(activa);
    }

    public List<Central> mostrarCentralesPorTipo(Tipo tipo) {
        return centralRepo.findByTipo(tipo);
    }

    public List<Central> mostrarCentralesAntesDelAnio(LocalDateTime fecha) {
        return centralRepo.findByInicioBefore(fecha);
    }
}
