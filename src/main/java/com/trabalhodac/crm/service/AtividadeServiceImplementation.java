package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Atividade;
import com.trabalhodac.crm.repository.AtividadeRepositorio;

@Service
public class AtividadeServiceImplementation implements AtividadeService {

	@Autowired
	AtividadeRepositorio repositorio;
	public Atividade criaAtividade(Atividade atividade) {
		return repositorio.save(atividade);
	}
	
	public List<Atividade> getAtividades() {
		return repositorio.findAll();
	}

	
	public Atividade getAtividade(int id) {
		return repositorio.findById(id).orElse(null);
	}

	public Atividade editaAtividade(Atividade atividade, int id) {
		Atividade atividadeAntiga = repositorio.findById(id).orElse(null);
		
		atividadeAntiga.setId(atividade.getId());
		atividadeAntiga.setData(atividade.getData());
		atividadeAntiga.setDescricao(atividade.getDescricao());
		atividadeAntiga.setHorario_inicial(atividade.getHorario_inicial());
		atividadeAntiga.setHorario_final(atividade.getHorario_final());
		atividadeAntiga.setNome(atividade.getNome());
		atividadeAntiga.setTipo(atividade.getTipo());
		
		repositorio.save(atividadeAntiga);
		
		return atividadeAntiga; 
	}

	public void removeAtividade(int id) {
		repositorio.deleteById(id);	
	}

}
