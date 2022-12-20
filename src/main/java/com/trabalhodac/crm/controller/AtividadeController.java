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

import com.trabalhodac.crm.model.Atividade;
import com.trabalhodac.crm.service.AtividadeService;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {
	
	@Autowired
	AtividadeService service;
	@PostMapping("/criaAtividade")
	public Atividade criaAtividade(@RequestBody Atividade atividade) {
		return service.criaAtividade(atividade);
	}
	
	@GetMapping("/getAtividades")
	public List<Atividade> getAtividades(){
		return service.getAtividades();
	}
	
	@GetMapping("/getAtividade/{id}")
	public Atividade getAtividade(@PathVariable int id){
		return service.getAtividade(id);
	}
	
	@PutMapping("/editaAtividade/{id}")
	public Atividade editaAtividade(@PathVariable int id, @RequestBody Atividade atividade){
		return service.editaAtividade(atividade, id);
	}
	
	@DeleteMapping("/removeAtividade/{id}")
	public ResponseEntity<String> removeAtividade(@PathVariable int id){
		service.removeAtividade(id);
		return new ResponseEntity<String>("Atividade removida com sucesso!", HttpStatus.OK);
	}


}
