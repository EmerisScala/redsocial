package com.redsocial.taskservicecontratosv1.service;

import java.util.List;

import com.redsocial.taskservicecontratosv1.entity.Confirmaciones;
import com.redsocial.taskservicecontratosv1.model.ConfirmacionesDto;

public interface ConfirmacionesService {
	Confirmaciones  obtenerById(String id);
	Confirmaciones guardar(ConfirmacionesDto confirmacionesDto);
	void remover(String id);
	Confirmaciones modificar(String id, ConfirmacionesDto confirmacionesDto);
}
