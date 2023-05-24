package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.Incidencia;
import com.inserta.ejercicio135.services.IncidenciaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/incidencias")
public class IncidenciasController {

    private final IncidenciaService incidenciaService;

    public IncidenciasController(IncidenciaService incidenciaService) {
        this.incidenciaService = incidenciaService;
    }

    @GetMapping("/todas")
    public String getAllIncidencias(Model model) {
        List<Incidencia> incidencias = incidenciaService.getAllIncidencias();
        model.addAttribute("incidencias", incidencias);
        return "listadoIncidencias";
    }

    @GetMapping("/resueltas/{resuelta}")
    public String getIncidenciasResueltas(@PathVariable boolean resuelta ,Model model) {
        List<Incidencia> incidenciasResueltas = incidenciaService.getIncidenciasResueltas(resuelta);
        model.addAttribute("incidencias", incidenciasResueltas);
        return "listadoIncidencias";
    }

    @GetMapping("/anio/{anioinicio}/{aniofinal}")
    public String getIncidenciasDelAnio( Model model, @PathVariable Integer anioinicio, @PathVariable Integer aniofinal) {
        LocalDateTime fechainicio = LocalDateTime.of(anioinicio,1,1,0,0);
        LocalDateTime fechafinal = LocalDateTime.of(aniofinal,12,31,0,0);
        List<Incidencia> incidenciasAnio = incidenciaService.getIncidenciasDelAnio(fechainicio, fechafinal);
        model.addAttribute("incidencias", incidenciasAnio);
        return "listadoIncidencias";
    }
}

