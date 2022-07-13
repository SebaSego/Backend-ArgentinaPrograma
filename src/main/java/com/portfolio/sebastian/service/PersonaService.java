package com.portfolio.sebastian.service;

import com.portfolio.sebastian.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.sebastian.repository.PersonaRepository;


@Service
public class PersonaService implements IPersonaService{

    
    @Autowired
    public PersonaRepository persoRepo;

    
    
    @Override
    public Persona verPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void modifPersona(Persona per) {

        persoRepo.save(per);
    }


    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }



}
