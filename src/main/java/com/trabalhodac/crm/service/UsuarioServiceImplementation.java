package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Usuario;
import com.trabalhodac.crm.repository.UsuarioRepositorio;

@Service
public class UsuarioServiceImplementation implements UsuarioService {

	@Autowired
	UsuarioRepositorio repositorio;
	public Usuario criaUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}
	
	public List<Usuario> getUsuarios() {
		return repositorio.findAll();
	}

}
