package com.redsocial.entityserviceusuariosv1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.entityserviceusuariosv1.entity.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, String> {
	Optional<Usuarios> findById(String id);
}
