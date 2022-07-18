package com.portfolio.sebastian.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="experiencia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="puesto")
    private String puesto;
    @Column(name="institucion")
    private String institucionExp;
    @Column(name="anioInicio")
    private int anioInicioExp;
    @Column(name="anioFin")
    private int anioFinExp;
    @Column(name="ciudad")
    private String ciudad;
    @Column(name="detalle")
    private String detalleExp;
    @Column(name="urlLogoEmpresa")
    private String urlLogoEmpresa;






}
