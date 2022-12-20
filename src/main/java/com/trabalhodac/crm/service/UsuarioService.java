package com.trabalhodac.crm.service;

import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Usuario;

@Service
public interface UsuarioService {
	//Create
	public Usuario criaUsuario(Usuario usuario);
}
