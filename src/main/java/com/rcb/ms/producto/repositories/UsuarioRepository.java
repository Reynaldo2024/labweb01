package com.rcb.ms.producto.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rcb.ms.producto.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
}
