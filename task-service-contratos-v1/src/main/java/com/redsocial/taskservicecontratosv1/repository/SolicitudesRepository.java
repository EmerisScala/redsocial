package com.redsocial.taskservicecontratosv1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.taskservicecontratosv1.entity.Solicitudes;

public interface SolicitudesRepository extends JpaRepository<Solicitudes, String>  {
	Optional<Solicitudes> findById(String id);
}
