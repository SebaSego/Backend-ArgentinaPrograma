package com.portfolio.sebastian.service;

import com.portfolio.sebastian.model.Educacion;
import com.portfolio.sebastian.model.Experiencia;


import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> verExperiencia();

    public void crearExperiencia (Experiencia experiencia);

    public void modificarExperiencia (Experiencia experiencia);

    public void borrarExperiencia (Long id);

    public Experiencia buscarExperiencia (Long id);
}
