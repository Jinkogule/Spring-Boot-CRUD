package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Evento;

@Service
public interface EventoService {
	public Evento criaEvento(Evento evento);
	public List<Evento> getEventos();
	public Evento getEvento(int id);
	public Evento editaEvento(Evento evento, int id);
	public void removeEvento(int id);
}
