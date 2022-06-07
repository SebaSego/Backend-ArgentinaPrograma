package com.portfolio.sebastian.service;


import com.portfolio.sebastian.model.Proyectos;

import java.util.List;

public interface IProyectosService {

    public List<Proyectos> verProyectos();

    public void crearProyectos (Proyectos proyectos);

    public void borrarProyectos (Long id);



    public Proyectos buscarProyectos (Long id);
}
