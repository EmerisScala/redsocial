package com.redsocial.entityserviceempresasv1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entityserviceempresasv1.entity.Empresas;
import com.redsocial.entityserviceempresasv1.model.EmpresasDto;
import com.redsocial.entityserviceempresasv1.repository.EmpresasRepository;

@Service
public class EmpresasServiceImpl implements EmpresasService {
	@Autowired
	private EmpresasRepository empresasRepository;

	@Override
	public List<Empresas> obtenerTodos() {
		return empresasRepository.findAll();
	}

	@Override
	public Empresas obtenerById(String id) {
		return empresasRepository.findById(id)
				.orElseThrow(() -> EmpresasNoEncontradasException.from("No se encontro el usuario", id));
	}

	@Override
	public Empresas guardar(EmpresasDto empresasDto) {
		Empresas empresa = Empresas.from(empresasDto);
		return empresasRepository.save(empresa);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empresas modificar(String id, EmpresasDto empresasDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
