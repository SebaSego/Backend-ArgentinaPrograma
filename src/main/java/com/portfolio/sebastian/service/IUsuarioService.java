package com.portfolio.sebastian.service;

import com.portfolio.sebastian.model.Usuario;

public interface IUsuarioService {
    public Usuario verUsuario(Long id);

    public void crearUsuario (Usuario us);

    public void modifUsuario (Usuario us);

    public void borrarUsuario (Long id);

}
