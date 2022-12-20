package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Edicao;

@Service
public interface EdicaoService {
	public Edicao criaEdicao(Edicao edicao);
	public List<Edicao> getEdicoes();
	public Edicao getEdicao(int id);
	public Edicao editaEdicao(Edicao edicao, int id);
	public void removeEdicao(int id);
}
