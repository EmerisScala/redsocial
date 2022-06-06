package com.redsocial.taskservicecontratosv1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.taskservicecontratosv1.entity.Confirmaciones;
import com.redsocial.taskservicecontratosv1.model.ConfirmacionesDto;
import com.redsocial.taskservicecontratosv1.repository.ConfirmacionesRepository;

@Service
public class ConfirmacionesServiceImpl implements ConfirmacionesService {

	@Autowired
	private ConfirmacionesRepository confirmacionesRepository;

	@Override
	public Confirmaciones obtenerById(String id) {
		return confirmacionesRepository.findById(id)
				.orElseThrow(() -> DatosNoEncontradasException.from("No se encontro informacion", id));
	}

	@Override
	public Confirmaciones guardar(ConfirmacionesDto confirmacionesDto) {
		Confirmaciones solicitud = Confirmaciones.from(confirmacionesDto);
		return confirmacionesRepository.save(solicitud);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Confirmaciones modificar(String id, ConfirmacionesDto confirmacionesDto) {
		Confirmaciones confirmaciones = confirmacionesRepository.findById(id)
				.orElseThrow(() -> DatosNoEncontradasException.from("No se encontro el informacion", id));

		confirmaciones = Confirmaciones.from(confirmacionesDto);

		confirmaciones = confirmacionesRepository.save(confirmaciones);

		return confirmaciones;
	}

}
