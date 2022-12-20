package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Espaco;

@Service
public interface EspacoService {
	public Espaco criaEspaco(Espaco espaco);
	public List<Espaco> getEspacos();
	public Espaco getEspaco(int id);
	public Espaco editaEspaco(Espaco espaco, int id);
	public void removeEspaco(int id);
}
