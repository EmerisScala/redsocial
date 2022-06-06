package com.redsocial.taskservicecontratosv1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.taskservicecontratosv1.entity.Contratos;
import com.redsocial.taskservicecontratosv1.model.ContratosDto;
import com.redsocial.taskservicecontratosv1.repository.ContratosRepository;

@Service
public class ContratosServiceImpl implements ContratosService {
	
	@Autowired
	private ContratosRepository contratosRepository;

	@Override
	public Contratos obtenerById(String id) {
		return contratosRepository.findById(id)
				.orElseThrow(() -> DatosNoEncontradasException.from("No se encontro informacion", id));
	}

	@Override
	public Contratos guardar(ContratosDto contratosDto) {
		Contratos contrato = Contratos.from(contratosDto);
		return contratosRepository.save(contrato);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contratos modificar(String id, ContratosDto contratosDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
