package com.portfolio.sebastian.controller;

import com.portfolio.sebastian.model.Educacion;
import com.portfolio.sebastian.repository.PersonaRepository;
import com.portfolio.sebastian.service.IEducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {

    @Autowired
    private IEducacionService eduServ;
    @Autowired
    private PersonaRepository personaRepo;

    @PostMapping("/new")
    public void agregarEducacion (@RequestBody Educacion educacion){
        eduServ.crearEducacion(educacion);
    }

    @PutMapping("/modificar")
    public void modificarEducacion(@RequestBody Educacion educacion){
        eduServ.modificarEducacion(educacion);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarEducacion (@PathVariable Long id){

        eduServ.borrarEducacion(id);
    }


}
