package com.redsocial.entityserviceusuariosv1.service;

import java.util.List;

import com.redsocial.entityserviceusuariosv1.entity.Experiencias;
import com.redsocial.entityserviceusuariosv1.model.ExperienciasDto;


public interface ExperienciasService {
	List<Experiencias>  obtenerByNumeroEmpleado(String id);
	Experiencias guardar(ExperienciasDto experienciasDto);
	void remover(String id);
	Experiencias modificar(String id, ExperienciasDto experienciasDto);
}
