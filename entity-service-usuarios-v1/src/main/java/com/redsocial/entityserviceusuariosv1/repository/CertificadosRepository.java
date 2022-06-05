package com.redsocial.entityserviceusuariosv1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.entityserviceusuariosv1.entity.Certificados;

public interface CertificadosRepository extends JpaRepository<Certificados, String> {
	Optional<List<Certificados>> findByNumeroUsuario(String numeroUsuario);
}
