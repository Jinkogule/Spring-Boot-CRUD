package com.trabalhodac.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.trabalhodac.crm.model.Usuario;
import com.trabalhodac.crm.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService service;

	@PostMapping("/criaUsuario")
	public ResponseEntity<Usuario> criaUsuario(@RequestBody Usuario usuario) {
		Usuario novoUsuario = service.criaUsuario(usuario);
		return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
	}

	@GetMapping("/getUsuarios")
	public List<Usuario> getUsuarios(){
		return service.getUsuarios();
	}

	@GetMapping("/getUsuario/{id}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable int id){
		Usuario usuario = service.getUsuario(id);
		if (usuario == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}

	@PutMapping("/editaUsuario/{id}")
	public ResponseEntity<Usuario> editaUsuario(@PathVariable int id, @RequestBody Usuario usuario){
		Usuario usuarioAtualizado = service.editaUsuario(usuario, id);
		if (usuarioAtualizado == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(usuarioAtualizado, HttpStatus.OK);
	}

	@DeleteMapping("/removeUsuario/{id}")
	public ResponseEntity<String> removeUsuario(@PathVariable int id){
		service.removeUsuario(id);
		return new ResponseEntity<>("Usuário removido com sucesso!", HttpStatus.OK);
	}
}
