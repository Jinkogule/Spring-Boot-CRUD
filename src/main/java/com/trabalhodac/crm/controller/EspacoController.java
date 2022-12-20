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

import com.trabalhodac.crm.model.Espaco;
import com.trabalhodac.crm.service.EspacoService;

@RestController
@RequestMapping("/espaco")
public class EspacoController {
	
	@Autowired
	EspacoService service;
	@PostMapping("/criaEspaco")
	public Espaco criaEspaco(@RequestBody Espaco espaco) {
		return service.criaEspaco(espaco);
	}
	
	@GetMapping("/getEspacos")
	public List<Espaco> getEspacos(){
		return service.getEspacos();
	}
	
	@GetMapping("/getEspaco/{id}")
	public Espaco getEspaco(@PathVariable int id){
		return service.getEspaco(id);
	}
	
	@PutMapping("/editaEspaco/{id}")
	public Espaco editaEspaco(@PathVariable int id, @RequestBody Espaco espaco){
		return service.editaEspaco(espaco, id);
	}
	
	@DeleteMapping("/removeEspaco/{id}")
	public ResponseEntity<String> removeEspaco(@PathVariable int id){
		service.removeEspaco(id);
		return new ResponseEntity<String>("Espaço removido com sucesso!", HttpStatus.OK);
	}


}
