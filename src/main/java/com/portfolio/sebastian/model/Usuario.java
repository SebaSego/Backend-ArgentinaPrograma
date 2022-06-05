package com.portfolio.sebastian.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="Usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="usuario")
    private String usuario;
    @Column(name="password")
    private String password;


    //Relacion con Entidad o tabla Persona
    @OneToOne(cascade = CascadeType.ALL)
    private Persona persona;


}
