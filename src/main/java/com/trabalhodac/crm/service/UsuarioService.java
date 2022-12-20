package com.trabalhodac.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalhodac.crm.model.Usuario;

@Service
public interface UsuarioService {
	public Usuario criaUsuario(Usuario usuario);
	public List<Usuario> getUsuarios();
	public Usuario getUsuario(int id);
	public Usuario editaUsuario(Usuario usuario, int id);
	public void removeUsuario(int id);
}
