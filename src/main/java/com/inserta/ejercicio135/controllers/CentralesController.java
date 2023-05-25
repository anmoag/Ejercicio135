package com.inserta.ejercicio135.controllers;

import com.inserta.ejercicio135.models.Tipo;
import com.inserta.ejercicio135.services.CentralService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/centrales")
public class CentralesController {

    private final CentralService centralService;

    public CentralesController(CentralService centralService) {
        this.centralService = centralService;
    }

    @GetMapping("/todas")
    public String getAllCentrales(Model model) {
        model.addAttribute("listado", centralService.mostrarCentrales());
        return "listadoCentrales";
    }

    @GetMapping("/activas")
    public String getCentralesActivas(Model model) {
        model.addAttribute("listado", centralService.mostrarCentralesActivas(true));
        return "listadoCentrales";
    }

    @GetMapping("/inactivas")
    public String getCentralesInactivas(Model model) {
        model.addAttribute("listado", centralService.mostrarCentralesActivas(false));
        return "listadoCentrales";
    }

    @GetMapping("/tipo/{tipo}")
    public String getCentralesByTipo(@PathVariable Tipo tipo, Model model) {
        model.addAttribute("listado", centralService.mostrarCentralesPorTipo(tipo));
        return "listadoCentrales";
    }

    @GetMapping("/antes/{anio}")
    public String getCentralesAntesDeAnio(@PathVariable Integer anio, Model model) {
        LocalDateTime fecha = LocalDateTime.of(anio,1,1,0,0);
        model.addAttribute("listado", centralService.mostrarCentralesAntesDelAnio(fecha));
        return "listadoCentrales";
    }

}