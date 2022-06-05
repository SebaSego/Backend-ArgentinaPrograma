
package com.portfolio.sebastian.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="ocupacion")
    private String ocupacion;
    @Column(name="email")
    private String email;
    @Column(name="telefono")
    private String telefono;
    @Column(name="urlImagen")
    private String urlImagen;

    /*
    //Relacion con Entidad o tabla Usuario
    @OneToOne(cascade = CascadeType.ALL)
    private Usuario usuario;
     */

    //Relacion con Entidad o tabla Educacion
    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private Collection<Educacion> educacion;



    //Relacion con Entidad o tabla Experiencia
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Experiencia> experiencia;

    //Relacion con Entidad o tabla Proyectos
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Proyectos> proyectos;

    //Relacion con Entidad o tabla Ubicacion
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Ubicacion> ubicacion;

    //Relacion con Entidad o tabla Redes Sociales
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<RedesSociales> redes_sociales;

    /*

    //Relacion con Entidad o tabla Experiencia
    @OneToMany(mappedBy="id", cascade = CascadeType.ALL)
    private List<Experiencia> experiencia;

    //Relacion con Entidad o tabla Proyectos
    @OneToMany(mappedBy="id", cascade = CascadeType.ALL)
    private List<Proyectos> proyectos;

    //Relacion con Entidad o tabla Redes Sociales
    @OneToMany(mappedBy="id", cascade = CascadeType.ALL)
    private List<RedesSociales> redesSociales;

    //Relacion con Entidad o tabla Ubicacion
    @OneToMany(mappedBy="id", cascade = CascadeType.ALL)
    private List<Ubicacion> ubicacion;

*/


}
