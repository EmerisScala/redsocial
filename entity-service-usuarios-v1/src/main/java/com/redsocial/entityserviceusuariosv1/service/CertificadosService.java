package com.redsocial.entityserviceusuariosv1.service;

import java.util.List;

import com.redsocial.entityserviceusuariosv1.entity.Certificados;
import com.redsocial.entityserviceusuariosv1.model.CertificadosDto;

public interface CertificadosService {
	List<Certificados>  obtenerByNumeroEmpleado(String id);
	Certificados guardar(CertificadosDto certificadosDto);
	void remover(String id);
	Certificados modificar(String id, CertificadosDto certificadosDto);
}
