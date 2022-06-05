
package com.portfolio.sebastian.controller;

import com.portfolio.sebastian.model.Persona;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.portfolio.sebastian.service.IPersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    
   @Autowired
   private IPersonaService persoServ;

    @PostMapping ("/new")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        
    }

    
    @GetMapping ("/ver")
    @ResponseBody
    public List<Persona> verPersonas(){

        return persoServ.verPersonas();
    }
    
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){

        persoServ.borrarPersona(id);
    }
    
    
}
