package com.portfolio.sebastian.repository;


import com.portfolio.sebastian.model.RedesSociales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedesSocialesRepository extends JpaRepository<RedesSociales, Long> {
}
