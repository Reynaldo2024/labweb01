package com.rcb.ms.producto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rcb.ms.producto.domain.Investigador;
import com.rcb.ms.producto.repositories.InvestigadorRepository;

@Service
public class InvestigardorServiceImp implements InvestigadorService {
	@Autowired
	private InvestigadorRepository invRep;
	
		
	@Override
	@Transactional
	public List<Investigador> listarTodos() {
		return invRep.findAll();
	
	}

	@Override
	@Transactional
	public Investigador buscarPorId(Long id) {
		Optional<Investigador> investigador = invRep.findById(id);
		return investigador.get();		
		
	}

	@Override
	@Transactional
	public Investigador grabar(Investigador investigador) {
		return invRep.save(investigador);
	
	}

	@Override
	@Transactional
	public Investigador actualizar(Investigador investigador, long id) {
		investigador.setIdInvestigador(id);
		return invRep.save(investigador);
	}

	@Override
	@Transactional
	public void eliminar(long id) {
		invRep.deleteById(id);

	}

	@Override
	@Transactional
	public Investigador findByDni(String dni) {
		Optional<Investigador> inv = invRep.findByDni(dni);
		return inv.get();
	}

	@Override
	@Transactional
	public Investigador findByEmail(String email) {
		return invRep.findByEmail(email).get();
	}

}
