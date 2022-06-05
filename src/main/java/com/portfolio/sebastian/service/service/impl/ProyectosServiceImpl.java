package com.portfolio.sebastian.service.service.impl;

import com.portfolio.sebastian.model.Persona;
import com.portfolio.sebastian.model.Proyectos;
import com.portfolio.sebastian.repository.PersonaRepository;
import com.portfolio.sebastian.repository.ProyectosRepository;
import com.portfolio.sebastian.service.IProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProyectosServiceImpl implements IProyectosService {

    @Autowired
    public ProyectosRepository proyRepo;
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos proyectos) {
        Persona persona=persoRepo.findAll().get(0);
        persona.getProyectos().add(proyectos);
        persoRepo.save(persona);
    }

    @Override
    public void borrarUnProyecto(Long id) {
        proyRepo.deleteById(id);
    }
    @Override
    public void borrarProyectos(Long id) {
        Persona persona=persoRepo.findAll().get(0);
        persona.getProyectos().remove(proyRepo.findById(id));
        persona.setProyectos(persona.getProyectos());
        persoRepo.save(persona);

        //proyRepo.deleteById(id);
    }



    @Override
    public Proyectos buscarProyectos(Long id) {
        return proyRepo.findById(id).orElse(null);
    }
}
