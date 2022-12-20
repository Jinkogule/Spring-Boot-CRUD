package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Usuario;

@Service
public interface UsuarioService {
	//Create
	public Usuario criaUsuario(Usuario usuario);
	public List<Usuario> getUsuarios();
}