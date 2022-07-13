package com.portfolio.sebastian.service;

import com.portfolio.sebastian.model.Persona;


public interface IPersonaService {
    
    public Persona verPersona(Long id);

    public void crearPersona (Persona per);

    public void modifPersona (Persona per);
    
    public void borrarPersona (Long id);
    

}
