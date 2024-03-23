package com.rcb.ms.producto.comtrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcb.ms.producto.domain.Investigador;
import com.rcb.ms.producto.services.InvestigadorService;

@RestController
@RequestMapping("/api/v1/investigadores")
public class InvestigadorController {
	@Autowired
	private InvestigadorService invService;
	
	@GetMapping
	public List<Investigador> listInvestigadores(){
		return invService.listarTodos();
	}
	
	@GetMapping ("/{id}")
	public Investigador listarPorId(@PathVariable Long id) {
		return invService.buscarPorId(id);
	}
	
	@PostMapping
	public Investigador crearInvestigador(@RequestBody Investigador investigador) {
		return invService.grabar(investigador);
	}
	
	@PutMapping ("/{id}")
	public Investigador editarInvestigador(@PathVariable Long id, @RequestBody Investigador inv) {
		Investigador invDB = invService.buscarPorId(id);


		invDB.setApeMat(inv.getApeMat());
		invDB.setApePat(inv.getApePat());
		invDB.setDni(inv.getDni());
		invDB.setEmail(inv.getEmail());
		invDB.setFechaReg(inv.getFechaReg());
		invDB.setNombres(inv.getNombres());
		
		return invService.grabar(invDB);		
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminarInvestigador(@PathVariable Long id) {
	invService.eliminar(id);
	}
}
