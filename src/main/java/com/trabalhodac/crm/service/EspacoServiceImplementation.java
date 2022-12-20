package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Espaco;
import com.trabalhodac.crm.repository.EspacoRepositorio;

@Service
public class EspacoServiceImplementation implements EspacoService {

	@Autowired
	EspacoRepositorio repositorio;
	public Espaco criaEspaco(Espaco espaco) {
		return repositorio.save(espaco);
	}
	
	public List<Espaco> getEspacos() {
		return repositorio.findAll();
	}

	
	public Espaco getEspaco(int id) {
		return repositorio.findById(id).orElse(null);
	}

	public Espaco editaEspaco(Espaco espaco, int id) {
		Espaco espacoAntigo = repositorio.findById(id).orElse(null);
		
		espacoAntigo.setId(espaco.getId());
		espacoAntigo.setNome(espaco.getNome());
		espacoAntigo.setRecursos(espaco.getRecursos());
		espacoAntigo.setCapacidade(espaco.getCapacidade());
		espacoAntigo.setLocalizacao(espaco.getLocalizacao());
		
		repositorio.save(espacoAntigo);
		
		return espacoAntigo; 
	}

	public void removeEspaco(int id) {
		repositorio.deleteById(id);	
	}

}
