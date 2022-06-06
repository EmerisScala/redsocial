package com.redsocial.taskservicecontratosv1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.taskservicecontratosv1.entity.Confirmaciones;

public interface ConfirmacionesRepository extends JpaRepository<Confirmaciones, String> {
	Optional<Confirmaciones> findById(String id);
}
