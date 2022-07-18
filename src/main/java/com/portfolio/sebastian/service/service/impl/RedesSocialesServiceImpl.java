package com.portfolio.sebastian.service.service.impl;

import com.portfolio.sebastian.model.Persona;
import com.portfolio.sebastian.model.RedesSociales;
import com.portfolio.sebastian.repository.PersonaRepository;
import com.portfolio.sebastian.repository.RedesSocialesRepository;
import com.portfolio.sebastian.service.IRedesSocialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedesSocialesServiceImpl implements IRedesSocialesService {
    @Autowired
    RedesSocialesRepository redesRepo;
    @Autowired
    PersonaRepository persoRepo;

    @Override
    public List<RedesSociales> verRedSocial() {
        return redesRepo.findAll();
    }

    @Override  //Crear Entidad relacionada a una persona, en este caso ubicacion 0
    public void crearRedSocial(RedesSociales redSocial) {
        Persona persona= persoRepo.findAll().get(0);
        persona.getRedesSociales().add(redSocial);
        persoRepo.save(persona);
    }

    @Override  //Modificar Entidad ya cargada pasandole los parametros nuevos.
    public void modificarRedSocial(RedesSociales redSocial) {
        redesRepo.save(redSocial);
    }

    @Override  //Eliminar Entidad por id de la persona 0.
    public void borrarRedSocial(Long id) {
        Persona persona=persoRepo.findAll().get(0);
        persona.getRedesSociales().remove(this.buscarRedSocial(id));
        redesRepo.deleteById(id);
    }

    @Override
    public RedesSociales buscarRedSocial(Long id) {
        return redesRepo.findById(id).orElse(null);
    }
}
