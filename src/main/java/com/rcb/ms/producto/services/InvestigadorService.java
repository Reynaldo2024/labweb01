package com.rcb.ms.producto.services;

import java.util.List;

import com.rcb.ms.producto.domain.Investigador;

public interface InvestigadorService {
	List<Investigador>listarTodos();
	Investigador buscarPorId(Long id);
	Investigador grabar(Investigador investigador);
	Investigador actualizar(Investigador investigador, long id);
	void eliminar(long id);
	Investigador findByDni (String dni);
	Investigador findByEmail (String email);
	
}
