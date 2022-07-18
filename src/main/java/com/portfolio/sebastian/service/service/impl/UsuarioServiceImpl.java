package com.portfolio.sebastian.service.service.impl;

import com.portfolio.sebastian.model.Usuario;
import com.portfolio.sebastian.repository.UsuarioRepository;
import com.portfolio.sebastian.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepo;

    @Override
    public Usuario verUsuario(Long id) {
        return usuarioRepo.findById(id).orElse(null);
    }

    @Override
    public void crearUsuario(Usuario us) {
        usuarioRepo.save(us);
    }

    @Override
    public void modifUsuario(Usuario us) {
        usuarioRepo.save(us);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepo.deleteById(id);
    }
}
