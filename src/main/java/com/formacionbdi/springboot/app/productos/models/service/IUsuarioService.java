package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.productos.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
	public Usuario findById(Long id);
	public Usuario addUsuario(Usuario users);
	void deleteUsuarioById(Long id);
	
}
