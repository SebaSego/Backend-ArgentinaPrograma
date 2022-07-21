package com.portfolio.sebastian.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habilidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombreHabilidad;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="progreso")
    private Long progreso;
    @Column(name="imagen")
    private String imagen;

}
