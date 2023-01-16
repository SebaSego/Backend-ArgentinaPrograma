package com.portfolio.sebastian.controller;


import com.portfolio.sebastian.model.RedesSociales;
import com.portfolio.sebastian.service.IRedesSocialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redesSociales")
@CrossOrigin(origins = "*")
public class RedesSocialesController {

    @Autowired
    private IRedesSocialesService redesService;

    @PostMapping("/new")
    public void agregarRedSocial (@RequestBody RedesSociales redSocial){

        redesService.crearRedSocial(redSocial);
    }

    @PutMapping("/modificar")
    public void modificarRedSocial(@RequestBody RedesSociales redSocial){

        redesService.modificarRedSocial(redSocial);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<RedesSociales> verRedesSociales(){
        return redesService.verRedSocial();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarRedSocial (@PathVariable Long id){

        redesService.borrarRedSocial(id);
    }
}
