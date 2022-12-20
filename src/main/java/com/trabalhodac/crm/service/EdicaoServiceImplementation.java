package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Edicao;
import com.trabalhodac.crm.repository.EdicaoRepositorio;

@Service
public class EdicaoServiceImplementation implements EdicaoService {

	@Autowired
	EdicaoRepositorio repositorio;
	public Edicao criaEdicao(Edicao edicao) {
		return repositorio.save(edicao);
	}
	
	public List<Edicao> getEdicoes() {
		return repositorio.findAll();
	}

	public Edicao getEdicao(int id) {
		return repositorio.findById(id).orElse(null);
	}

	public Edicao editaEdicao(Edicao edicao, int id) {
		Edicao edicaoAntiga = repositorio.findById(id).orElse(null);
		
		edicaoAntiga.setId(edicao.getId());
		edicaoAntiga.setAno(edicao.getAno());
		edicaoAntiga.setCidade(edicao.getCidade());
		edicaoAntiga.setData_inicial(edicao.getData_inicial());
		edicaoAntiga.setData_final(edicao.getData_final());
		edicaoAntiga.setNumero(edicao.getNumero());
		
		repositorio.save(edicaoAntiga);
		
		return edicaoAntiga; 
	}

	public void removeEdicao(int id) {
		repositorio.deleteById(id);	
	}

}
