package com.portfolio.sebastian.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="ubicacion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ciudad")
    private String ciudad;
    @Column(name="provincia")
    private String provincia;
    @Column(name="pais")
    private String pais;



/*
    //Relacion con Entidad o tabla Persona
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id")
    private Persona persona;
*/

}
