package com.inserta.ejercicio135.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "provincias")
public class Provincia {
    @Id
    private String id;
    private String nombre;

}