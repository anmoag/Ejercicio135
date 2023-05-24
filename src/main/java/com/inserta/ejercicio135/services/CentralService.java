package com.inserta.ejercicio135.services;

import com.inserta.ejercicio135.models.Central;
import java.time.LocalDateTime;
import java.util.List;

public interface CentralService {
    List<Central> mostrarCentrales();

    List<Central> mostrarCentralesActivas(boolean activa);

    List<Central> mostrarCentralesPorTipo(int tipo);

    List<Central> mostrarCentralesAntesDelAnio(LocalDateTime anio);
}
