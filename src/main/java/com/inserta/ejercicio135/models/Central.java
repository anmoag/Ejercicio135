package com.inserta.ejercicio135.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "centrales")
public class Central {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "id_tipo", referencedColumnName = "id")
    private Tipo tipo;
    private String latitud;
    private String longitud;
    private String descripcion;
    private String imagen;
    private int potencia;
    @ManyToOne
    @JoinColumn(name="id_provincia", referencedColumnName = "id")
    private Provincia provincia;
    private boolean activa;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private String observaciones;

}
