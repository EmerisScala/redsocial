package com.redsocial.entityserviceusuariosv1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entityserviceusuariosv1.entity.Certificados;
import com.redsocial.entityserviceusuariosv1.model.CertificadosDto;
import com.redsocial.entityserviceusuariosv1.repository.CertificadosRepository;

@Service
public class CertificadosServiceImpl implements CertificadosService {
	
	@Autowired
	private CertificadosRepository certificadosRepository;

	@Override
	public List<Certificados> obtenerByNumeroEmpleado(String numeroUsuario) {
		return certificadosRepository.findByNumeroUsuario(numeroUsuario)
				.orElseThrow(() -> UsuariosNoEncontradoException.from("No se encontro certificados", numeroUsuario));
	}

	@Override
	public Certificados guardar(CertificadosDto certificadosDto) {
		Certificados certificado = Certificados.from(certificadosDto);
		return certificadosRepository.save(certificado);
	}

	@Override
	public void remover(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Certificados modificar(String id, CertificadosDto certificadosDto) {
		// TODO Auto-generated method stub
		return null;
	}
}
