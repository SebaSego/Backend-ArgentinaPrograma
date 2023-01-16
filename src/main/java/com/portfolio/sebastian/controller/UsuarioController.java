package com.portfolio.sebastian.controller;


import com.portfolio.sebastian.model.Usuario;
import com.portfolio.sebastian.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioServ;

    @PostMapping("/new")
    public void crearUsuario (@RequestBody Usuario us){
        usuarioServ.crearUsuario(us);

    }

    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Usuario verUsuario(@PathVariable Long id){

        return usuarioServ.verUsuario(id);
    }

    @PutMapping ("/actualizar") //primero hay que traer el Usuario para que me actualice con todas las entidades relacionadas, sino elimina todo
    public void modifUsuario (@RequestBody Usuario us){

        usuarioServ.modifUsuario(us);
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarUsuario (@PathVariable Long id){

        usuarioServ.borrarUsuario(id);
    }

}
