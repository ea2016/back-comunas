package com.formacionbdi.springboot.app.productos.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.formacionbdi.springboot.app.productos.models.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long>{

}
