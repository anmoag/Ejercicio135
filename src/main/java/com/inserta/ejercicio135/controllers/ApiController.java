package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.Central;
import com.inserta.ejercicio135.models.Incidencia;
import com.inserta.ejercicio135.services.CentralService;
import com.inserta.ejercicio135.services.IncidenciaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ApiController {

    private final CentralService centralService;
    private final IncidenciaService incidenciaService;

    public ApiController(CentralService centralService, IncidenciaService incidenciaService) {
        this.centralService = centralService;
        this.incidenciaService = incidenciaService;

    }

    @GetMapping("/api/v1/centrales")
    public List<Central> getAllCentralesJson() {
        return centralService.mostrarCentrales();
    }

    @GetMapping("/api/v1/incidencias")
    public List<Incidencia> getAllIncidenciasJson() {
        return incidenciaService.getAllIncidencias();
    }


}
