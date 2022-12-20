package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Atividade;

@Service
public interface AtividadeService {
	public Atividade criaAtividade(Atividade atividade);
	public List<Atividade> getAtividades();
	public Atividade getAtividade(int id);
	public Atividade editaAtividade(Atividade atividade, int id);
	public void removeAtividade(int id);
}
