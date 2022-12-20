package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Evento;
import com.trabalhodac.crm.repository.EventoRepositorio;

@Service
public class EventoServiceImplementation implements EventoService {

	@Autowired
	EventoRepositorio repositorio;
	public Evento criaEvento(Evento evento) {
		return repositorio.save(evento);
	}
	
	public List<Evento> getEventos() {
		return repositorio.findAll();
	}

	public Evento getEvento(int id) {
		return repositorio.findById(id).orElse(null);
	}

	public Evento editaEvento(Evento evento, int id) {
		Evento eventoAntigo = repositorio.findById(id).orElse(null);
		
		eventoAntigo.setId(evento.getId());
		eventoAntigo.setNome(evento.getNome());
		eventoAntigo.setDescricao(evento.getDescricao());
		eventoAntigo.setSigla(evento.getSigla());
		
		repositorio.save(eventoAntigo);
		
		return eventoAntigo; 
	}

	public void removeEvento(int id) {
		repositorio.deleteById(id);	
	}

}
