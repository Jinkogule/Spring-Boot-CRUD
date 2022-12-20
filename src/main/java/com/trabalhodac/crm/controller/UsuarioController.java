package com.trabalhodac.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trabalhodac.crm.model.Usuario;
import com.trabalhodac.crm.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	@PostMapping("/criaUsuario")
	public String criaUsuario(Usuario usuario) {
		service.criaUsuario(usuario);
		return "cadastro-sucesso.html";
	}
	
	@GetMapping("/getUsuarios")
	public List<Usuario> getUsuarios(){
		return service.getUsuarios();
	}
	
	@GetMapping("/getUsuario/{id}")
	public Usuario getUsuario(@PathVariable int id){
		return service.getUsuario(id);
	}
	
	@PutMapping("/editaUsuario/{id}")
	public Usuario editaUsuario(@PathVariable int id, @RequestBody Usuario usuario){
		return service.editaUsuario(usuario, id);
	}
	
	@DeleteMapping("/removeUsuario/{id}")
	public ResponseEntity<String> removeUsuario(@PathVariable int id){
		service.removeUsuario(id);
		return new ResponseEntity<String>("Usuário removido com sucesso!", HttpStatus.OK);
	}


}
