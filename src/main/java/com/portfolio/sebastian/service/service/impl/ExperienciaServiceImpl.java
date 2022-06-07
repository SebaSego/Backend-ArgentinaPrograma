package com.portfolio.sebastian.service.service.impl;

import com.portfolio.sebastian.model.Experiencia;
import com.portfolio.sebastian.model.Persona;
import com.portfolio.sebastian.repository.ExperienciaRepository;
import com.portfolio.sebastian.repository.PersonaRepository;
import com.portfolio.sebastian.service.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExperienciaServiceImpl implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expRepo;

    @Autowired
    PersonaRepository persoRepo;

    @Override
    public List<Experiencia> verExperiencia() {

        return expRepo.findAll();
    }
    @Override  //Crear experiencia relacionado a una persona, en este caso ubicacion 0
    public void crearExperiencia(Experiencia experiencia) {
        Persona persona=persoRepo.findAll().get(0);
        persona.getExperiencia().add(experiencia);
        persoRepo.save(persona);
    }

    @Override
    public void borrarExperiencia(Long id)
    {
        Persona persona=persoRepo.findAll().get(0);
        persona.getExperiencia().remove(this.buscarExperiencia(id));
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
}
