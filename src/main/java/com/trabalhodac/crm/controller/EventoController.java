package com.trabalhodac.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalhodac.crm.model.Evento;
import com.trabalhodac.crm.service.EventoService;

@RestController
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	EventoService service;
	@PostMapping("/criaEvento")
	public Evento criaEvento(@RequestBody Evento evento) {
		return service.criaEvento(evento);
	}
	
	@GetMapping("/getEventos")
	public List<Evento> getEventos(){
		return service.getEventos();
	}
	
	@GetMapping("/getEvento/{id}")
	public Evento getEvento(@PathVariable int id){
		return service.getEvento(id);
	}
	
	@PutMapping("/editaEvento/{id}")
	public Evento editaEvento(@PathVariable int id, @RequestBody Evento evento){
		return service.editaEvento(evento, id);
	}
	
	@DeleteMapping("/removeEvento/{id}")
	public ResponseEntity<String> removeEvento(@PathVariable int id){
		service.removeEvento(id);
		return new ResponseEntity<String>("Evento removido com sucesso!", HttpStatus.OK);
	}


}
