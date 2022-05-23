package com.portfolio.sebastian.service.service.impl;

import com.portfolio.sebastian.model.Educacion;
import com.portfolio.sebastian.model.Persona;
import com.portfolio.sebastian.repository.EducacionRepository;
import com.portfolio.sebastian.repository.PersonaRepository;
import com.portfolio.sebastian.service.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EducacionServiceImpl implements IEducacionService {

    @Autowired
    EducacionRepository eduRepo;
    @Autowired
    PersonaRepository persoRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override  //Crear educacion relacionado a una persona, en este caso ubicacion 0
    public void crearEducacion(Educacion educacion) {
        Persona persona=persoRepo.findAll().get(0);
        persona.getEducacion().add(educacion);
        persoRepo.save(persona);


    }

    @Override  //Modificar Educacion ya cargada pasandole los parametros nuevos.
    public void modificarEducacion(Educacion educacion) {

        eduRepo.save(educacion);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
}
