package com.portfolio.sebastian.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="proyectos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="titulo")
    private String titulo;
    @Column(name="detalle")
    private String detalle;
    @Column(name="urlImagen")
    private String urlImagen;




}
