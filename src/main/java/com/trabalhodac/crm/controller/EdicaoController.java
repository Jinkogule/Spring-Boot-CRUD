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

import com.trabalhodac.crm.model.Edicao;
import com.trabalhodac.crm.service.EdicaoService;

@RestController
@RequestMapping("/edicao")
public class EdicaoController {
	
	@Autowired
	EdicaoService service;
	@PostMapping("/criaEdicao")
	public Edicao criaEdicao(@RequestBody Edicao edicao) {
		return service.criaEdicao(edicao);
	}
	
	@GetMapping("/getEdicoes")
	public List<Edicao> getEdicoes(){
		return service.getEdicoes();
	}
	
	@GetMapping("/getEdicao/{id}")
	public Edicao getEdicao(@PathVariable int id){
		return service.getEdicao(id);
	}
	
	@PutMapping("/editaEdicao/{id}")
	public Edicao editaEdicao(@PathVariable int id, @RequestBody Edicao edicao){
		return service.editaEdicao(edicao, id);
	}
	
	@DeleteMapping("/removeEdicao/{id}")
	public ResponseEntity<String> removeEdicao(@PathVariable int id){
		service.removeEdicao(id);
		return new ResponseEntity<String>("Edição removida com sucesso!", HttpStatus.OK);
	}


}
