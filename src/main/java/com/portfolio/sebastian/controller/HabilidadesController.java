package com.portfolio.sebastian.controller;


import com.portfolio.sebastian.model.Experiencia;
import com.portfolio.sebastian.model.Habilidades;
import com.portfolio.sebastian.service.IHabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habilidades")
@CrossOrigin(origins = "*")
public class HabilidadesController {
    @Autowired
    private IHabilidadesService habilServ;

    @PostMapping("/new")
    public void agregarHabilidades (@RequestBody Habilidades habilidades){
        habilServ.crearHabilidades(habilidades);

    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Habilidades> verHabilidades(){

        return habilServ.verHabilidades();
    }

    @PutMapping("/modificar")
    public void modificarHabilidades(@RequestBody Habilidades habilidades){
        habilServ.modificarHabilidades(habilidades);
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarHabilidades (@PathVariable Long id){

        habilServ.borrarHabilidades(id);
    }

}
