package com.portfolio.sebastian.service;


import com.portfolio.sebastian.model.Habilidades;

import java.util.List;

public interface IHabilidadesService {

    public List<Habilidades> verHabilidades();

    public void crearHabilidades (Habilidades habilidades);

    public void modificarHabilidades (Habilidades habilidades);

    public void borrarHabilidades (Long id);

    public Habilidades buscarHabilidades (Long id);
}
