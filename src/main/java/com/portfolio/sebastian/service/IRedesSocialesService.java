package com.portfolio.sebastian.service;

import com.portfolio.sebastian.model.RedesSociales;

import java.util.List;

public interface IRedesSocialesService {

    public List<RedesSociales> verRedSocial();

    public void crearRedSocial (RedesSociales redSocial);

    public void modificarRedSocial (RedesSociales redSocial);

    public void borrarRedSocial (Long id);

    public RedesSociales buscarRedSocial (Long id);
}
