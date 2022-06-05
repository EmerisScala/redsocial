package com.redsocial.entityserviceusuariosv1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entityserviceusuariosv1.entity.Experiencias;
import com.redsocial.entityserviceusuariosv1.model.ExperienciasDto;
import com.redsocial.entityserviceusuariosv1.repository.ExperienciasRepository;


@Service
public class ExperienciasServiceImpl implements ExperienciasService {
	@Autowired
	private ExperienciasRepository experienciasRepository;

	@Override
	public List<Experiencias> obtenerByNumeroEmpleado(String numeroUsuario) {
		return experienciasRepository.findByNumeroUsuario(numeroUsuario)
				.orElseThrow(() -> UsuariosNoEncontradoException.from("No se encontro certificados", numeroUsuario));
	}

	@Override
	public Experiencias guardar(ExperienciasDto experienciasDto) {
		Experiencias experiencia = Experiencias.from(experienciasDto);
		return experienciasRepository.save(experiencia);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Experiencias modificar(String id, ExperienciasDto experienciasDto) {
		// TODO Auto-generated method stub
		return null;
	}
}
