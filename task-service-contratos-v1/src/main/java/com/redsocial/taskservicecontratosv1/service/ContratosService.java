package com.redsocial.taskservicecontratosv1.service;

import java.util.List;

import com.redsocial.taskservicecontratosv1.entity.Contratos;
import com.redsocial.taskservicecontratosv1.model.ContratosDto;

public interface ContratosService {
	Contratos obtenerById(String id);
	Contratos guardar(ContratosDto contratosDto);
	void remover(String id);
	Contratos modificar(String id, ContratosDto contratosDto);
}
