package com.inserta.ejercicio135.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Entity
    @Table(name = "incidencias")
    public class Incidencia {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private int idUsuario;
        private int idCentral;
        private String texto;
        private LocalDateTime fecha;
        private boolean resuelta;
}
