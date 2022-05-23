package com.portfolio.sebastian.service;

import com.portfolio.sebastian.model.Educacion;
import java.util.List;

public interface IEducacionService {

    public List<Educacion> verEducacion();

    public void crearEducacion (Educacion educacion);

    public void modificarEducacion (Educacion educacion);

    public void borrarEducacion (Long id);

    public Educacion buscarEducacion (Long id);

}
