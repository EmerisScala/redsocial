package com.redsocial.taskservicecontratosv1.service;

import com.redsocial.taskservicecontratosv1.entity.Solicitudes;
import com.redsocial.taskservicecontratosv1.model.SolicitudesDto;

public interface SolicitudesService {
	Solicitudes  obtenerById(String id);
	Solicitudes guardar(SolicitudesDto solicitudesDto);
	void remover(String id);
	Solicitudes modificar(String id, SolicitudesDto solicitudesDto);
}
