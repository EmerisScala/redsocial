package com.redsocial.taskservicecontratosv1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.taskservicecontratosv1.entity.Vacantes;
import com.redsocial.taskservicecontratosv1.model.VacantesDto;
import com.redsocial.taskservicecontratosv1.repository.VacantesRepository;

@Service
public class VacantesServiceImpl  implements VacantesService {
	@Autowired
	private VacantesRepository vacantesRepository;


	@Override
	public Vacantes obtenerById(String id) {
		return vacantesRepository.findById(id)
				.orElseThrow(() -> DatosNoEncontradasException.from("No se encontro informacion", id));
	}

	@Override
	public Vacantes guardar(VacantesDto vacantesDto) {
		Vacantes vacante = Vacantes.from(vacantesDto);
		return vacantesRepository.save(vacante);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vacantes modificar(String id, VacantesDto vacantesDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
