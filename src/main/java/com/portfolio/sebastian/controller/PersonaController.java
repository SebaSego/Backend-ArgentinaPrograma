
package com.portfolio.sebastian.controller;

import com.portfolio.sebastian.model.Persona;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.portfolio.sebastian.service.IPersonaService;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
   @Autowired
   private IPersonaService persoServ;

    @PostMapping ("/new")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        
    }

    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable Long id){

        return persoServ.verPersona(id);
    }

    @PutMapping ("/actualizar") //primero hay que traer la persona para que me actualice con todas las entidades relacionadas, sino elimina todo
    public void modifPersona (@RequestBody Persona pers){

        persoServ.modifPersona(pers);
    }
    
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){

        persoServ.borrarPersona(id);
    }
    
    
}
