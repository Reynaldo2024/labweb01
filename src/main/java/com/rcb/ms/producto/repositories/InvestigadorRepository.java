package com.rcb.ms.producto.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcb.ms.producto.domain.Investigador;

public interface InvestigadorRepository extends JpaRepository<Investigador, Long> {
	Optional<Investigador> findByDni(String dni);
	Optional<Investigador> findByEmail(String email);
}
