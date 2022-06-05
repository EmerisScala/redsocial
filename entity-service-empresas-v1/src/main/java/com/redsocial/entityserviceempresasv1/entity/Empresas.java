package com.redsocial.entityserviceempresasv1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.redsocial.entityserviceempresasv1.model.EmpresasDto;

@Entity
@Table(name = "empresas")
public class Empresas implements Serializable {
	private  static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private String id;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	@Column(name = "numero_usuario_encargado")
	private String numeroUsuarioEncargado;
	
	@NotEmpty
	private String contrasenia;

	public static Empresas from(EmpresasDto empresasDto) {
		Empresas empresa = new Empresas();
		empresa.setNombre(empresasDto.getNombre());
		empresa.setNumeroUsuarioEncargado(empresasDto.getNumeroUsuarioEncargado());
		empresa.setContrasenia(empresasDto.getContrasenia());
		return empresa;
	}
	
	public EmpresasDto to() {
		EmpresasDto empresa = new EmpresasDto();
		empresa.setNombre(this.getNombre());
		empresa.setNumeroUsuarioEncargado(this.getNumeroUsuarioEncargado());
		empresa.setContrasenia(this.getContrasenia());
		return empresa;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroUsuarioEncargado() {
		return numeroUsuarioEncargado;
	}

	public void setNumeroUsuarioEncargado(String numeroUsuarioEncargado) {
		this.numeroUsuarioEncargado = numeroUsuarioEncargado;
	}
	
	@JsonIgnore
	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}
