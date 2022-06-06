package com.redsocial.taskservicecontratosv1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.taskservicecontratosv1.entity.Vacantes;

public interface VacantesRepository extends JpaRepository<Vacantes, String>   {
	Optional<Vacantes> findById(String id);
}
