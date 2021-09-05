package com.formacionbdi.springboot.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.productos.models.entity.Usuario;
import com.formacionbdi.springboot.app.productos.models.service.IUsuarioService;

@RestController
@RequestMapping("/users")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> listar(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/detalle/{id}")
	public Usuario detalle(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	@PostMapping
	public void agregarUsuario(@RequestBody Usuario usuario) {
		usuarioService.addUsuario(usuario);
	}
	
	@PutMapping
	public void modificarUsuario(@RequestBody Usuario usuario) {
		usuarioService.addUsuario(usuario);
	}
	
	@DeleteMapping(value="/borrar/{id}")
	public void deleteUsuario(@PathVariable("id") Long id) {
		usuarioService.deleteUsuarioById(id);
	}

}
