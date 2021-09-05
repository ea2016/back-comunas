package com.formacionbdi.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.formacionbdi.springboot.app.productos.models.dao.UsuarioDAO;
import com.formacionbdi.springboot.app.productos.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private UsuarioDAO usuario;
	
	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuario.findAll(Sort.by(Sort.Direction.ASC, "idUsuario"));
	}

	@Override
	public Usuario findById(Long id) {
		return usuario.findById(id).orElse(null);
	}

	@Override
	public Usuario addUsuario(Usuario users) {
		return usuario.save(users);
	}
	
	@Override
	public void deleteUsuarioById(Long id) {
		usuario.deleteById(id);
	}
	
	

}
