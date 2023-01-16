package com.portfolio.sebastian.controller;

import com.portfolio.sebastian.model.Educacion;
import com.portfolio.sebastian.model.Experiencia;
import com.portfolio.sebastian.model.Persona;
import com.portfolio.sebastian.service.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = "*")
public class ExperienciaController {

    @Autowired
    IExperienciaService expServ;

    @PostMapping("/new")
    public void agregarExperiencia (@RequestBody Experiencia experiencia){
        expServ.crearExperiencia(experiencia);

    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia(){

        return expServ.verExperiencia();
    }

    @PutMapping("/modificar")
    public void modificarExperiencia(@RequestBody Experiencia experiencia){
        expServ.modificarExperiencia(experiencia);
    }
    @DeleteMapping ("/delete/{id}")
    public void borrarExperiencia (@PathVariable Long id){

        expServ.borrarExperiencia(id);
    }

}
