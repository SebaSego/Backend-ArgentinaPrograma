package com.portfolio.sebastian.controller;

import com.portfolio.sebastian.model.Proyectos;
import com.portfolio.sebastian.service.IProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {

    @Autowired
    IProyectosService proyServ;

    @PostMapping("/new")
    public void agregarProyecto (@RequestBody Proyectos proyectos){
        proyServ.crearProyectos(proyectos);

    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Proyectos> verProyectos(){

        return proyServ.verProyectos();
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarProyectos (@PathVariable (name = "id") Long id){

        proyServ.borrarProyectos(id);
    }

    @GetMapping("/buscar{id}")
    @ResponseBody
    public Proyectos buscarPorId (@PathVariable Long id){
        return proyServ.buscarProyectos(id);
    }

}
