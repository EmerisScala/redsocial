package com.redsocial.taskservicecontratosv1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.taskservicecontratosv1.entity.Solicitudes;
import com.redsocial.taskservicecontratosv1.model.SolicitudesDto;
import com.redsocial.taskservicecontratosv1.repository.SolicitudesRepository;

@Service
public class SolicitudesServiceImpl implements SolicitudesService {
	
	@Autowired
	private SolicitudesRepository solicitudesRepository;

	@Override
	public Solicitudes obtenerById(String id) {
		return solicitudesRepository.findById(id)
				.orElseThrow(() -> DatosNoEncontradasException.from("No se encontro informacion", id));
	}

	@Override
	public Solicitudes guardar(SolicitudesDto solicitudesDto) {
		Solicitudes solicitud = Solicitudes.from(solicitudesDto);
		return solicitudesRepository.save(solicitud);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Solicitudes modificar(String id, SolicitudesDto solicitudesDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
