package com.trabalhodac.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalhodac.crm.model.Usuario;
import com.trabalhodac.crm.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	@PostMapping("/criaUsuario")
	public Usuario criaUsuario(@RequestBody Usuario usuario) {
		return service.criaUsuario(usuario);
	}
	
	@GetMapping("/getUsuarios")
	public List<Usuario> getUsuarios(){
		return service.getUsuarios();
	}
	
	@GetMapping("/getUsuario/{id}")
	public Usuario getUsuario(@PathVariable int id){
		return service.getUsuario(id);
	}


}
