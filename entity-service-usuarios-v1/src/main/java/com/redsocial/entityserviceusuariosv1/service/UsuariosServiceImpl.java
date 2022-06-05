package com.redsocial.entityserviceusuariosv1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entityserviceusuariosv1.entity.Usuarios;
import com.redsocial.entityserviceusuariosv1.model.UsuariosDto;
import com.redsocial.entityserviceusuariosv1.repository.UsuariosRepository;

@Service
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepository;

	@Override
	public List<Usuarios> obtenerTodos() {
		return usuariosRepository.findAll();
	}

	@Override
	public Usuarios obtenerById(String id) {
		return usuariosRepository.findById(id)
				.orElseThrow(() -> UsuariosNoEncontradoException.from("No se encontro el usuario", id));
	}

	@Override
	public Usuarios guardar(UsuariosDto usuariosDto) {
		Usuarios usuario = Usuarios.from(usuariosDto);
		return usuariosRepository.save(usuario);
	}

	@Override
	public void remover(String id) {
		usuariosRepository.findById(id)
				.orElseThrow(() -> UsuariosNoEncontradoException.from("No se encontro el usuario", id));

		usuariosRepository.deleteById(id);

	}

	@Override
	public Usuarios modificar(String id, UsuariosDto usuariosDto) {
		Usuarios usuarios = usuariosRepository.findById(id)
				.orElseThrow(() -> UsuariosNoEncontradoException.from("No se encontro el usuario", id));

		usuarios = Usuarios.from(usuariosDto);

		usuarios = usuariosRepository.save(usuarios);

		return usuarios;
	}

}
