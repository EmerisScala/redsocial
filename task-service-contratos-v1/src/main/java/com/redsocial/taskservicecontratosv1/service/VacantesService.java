package com.redsocial.taskservicecontratosv1.service;

import java.util.List;

import com.redsocial.taskservicecontratosv1.entity.Vacantes;
import com.redsocial.taskservicecontratosv1.model.VacantesDto;

public interface VacantesService {
	Vacantes  obtenerById(String id);
	Vacantes guardar(VacantesDto vacantesDto);
	void remover(String id);
	Vacantes modificar(String id, VacantesDto vacantesDto);
}
