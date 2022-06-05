package com.portfolio.sebastian.repository;

import com.portfolio.sebastian.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long> {
}
