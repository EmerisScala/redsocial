package com.redsocial.entityserviceusuariosv1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.entityserviceusuariosv1.entity.Experiencias;

public interface ExperienciasRepository extends JpaRepository<Experiencias, String> {
	Optional<List<Experiencias>> findByNumeroUsuario(String numeroUsuario);
}