package com.redsocial.entityserviceempresasv1.service;

import java.util.List;

import com.redsocial.entityserviceempresasv1.entity.Empresas;
import com.redsocial.entityserviceempresasv1.model.EmpresasDto;

public interface EmpresasService {
	List<Empresas> obtenerTodos();
	Empresas obtenerById(String id);
	Empresas guardar(EmpresasDto empresasDto);
	void remover(String id);
	Empresas modificar(String id, EmpresasDto empresasDto);
}
