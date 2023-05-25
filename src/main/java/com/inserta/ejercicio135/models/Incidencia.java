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
        @ManyToOne
        @JoinColumn(name = "id_usuario", referencedColumnName = "id")
        private Usuario usuario;
        @ManyToOne
        @JoinColumn(name = "id_central", referencedColumnName = "id")
        private Central central;
        private String texto;
        private LocalDateTime fecha;
        private boolean resuelta;
}
