package com.rcb.ms.producto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcb.ms.producto.domain.ProyectoInvestigacion;

public interface ProyectoRepository extends JpaRepository<ProyectoInvestigacion, Long> {

}
