package com.redsocial.entityserviceempresasv1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.entityserviceempresasv1.entity.Empresas;

public interface EmpresasRepository extends JpaRepository<Empresas, String> {
	Optional<Empresas> findById(String id);
}
