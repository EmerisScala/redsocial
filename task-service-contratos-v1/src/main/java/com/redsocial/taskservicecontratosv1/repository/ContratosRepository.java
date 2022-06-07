package com.redsocial.taskservicecontratosv1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.taskservicecontratosv1.entity.Contratos;

public interface ContratosRepository extends JpaRepository<Contratos, String> {
	Optional<Contratos> findById(String id);
}
