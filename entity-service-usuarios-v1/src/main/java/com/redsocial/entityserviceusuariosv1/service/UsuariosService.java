package com.redsocial.entityserviceusuariosv1.service;

import java.util.List;

import com.redsocial.entityserviceusuariosv1.entity.Usuarios;
import com.redsocial.entityserviceusuariosv1.model.UsuariosDto;

public interface UsuariosService {
	List<Usuarios> obtenerTodos();
	Usuarios obtenerById(String id);
	Usuarios guardar(UsuariosDto usuariosDto);
	void remover(String id);
	Usuarios modificar(String id, UsuariosDto empleadosDto);
}
