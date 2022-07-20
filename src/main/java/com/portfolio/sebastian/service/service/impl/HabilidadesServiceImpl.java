package com.portfolio.sebastian.service.service.impl;

import com.portfolio.sebastian.model.Habilidades;
import com.portfolio.sebastian.model.Persona;
import com.portfolio.sebastian.repository.HabilidadesRepository;
import com.portfolio.sebastian.repository.PersonaRepository;
import com.portfolio.sebastian.service.IHabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadesServiceImpl implements IHabilidadesService {

    @Autowired
    private HabilidadesRepository habilRepo;
    @Autowired
    private PersonaRepository persoRepo;

    @Override
    public List<Habilidades> verHabilidades() {
        return habilRepo.findAll();
    }

    @Override
    public void crearHabilidades(Habilidades habilidades) {
        Persona persona=persoRepo.findAll().get(0);
        persona.getHabilidades().add(habilidades);
        persoRepo.save(persona);
    }

    @Override
    public void modificarHabilidades(Habilidades habilidades) {
        habilRepo.save(habilidades);
    }

    @Override
    public void borrarHabilidades(Long id) {
        Persona persona=persoRepo.findAll().get(0);
        persona.getHabilidades().remove(this.buscarHabilidades(id));
        habilRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidades(Long id) {
        return habilRepo.findById(id).orElse(null);
    }
}
