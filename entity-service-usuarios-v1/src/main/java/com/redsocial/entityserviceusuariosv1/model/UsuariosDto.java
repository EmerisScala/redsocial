package com.redsocial.entityserviceusuariosv1.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class UsuariosDto {
	int numero;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String correo;
	private String contrasenia;
	private List<CertificadosDto> certificados;
	private List<ExperienciasDto> experiencias;
	
	public int getNumeroUsuario() {
		return numero;
	}
	
	public void setNumeroUsuario(int numeroUsuario) {
		this.numero = numeroUsuario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public List<CertificadosDto> getCertificados() {
		return certificados;
	}

	public void setCertificados(List<CertificadosDto> certificados) {
		this.certificados = certificados;
	}

	public List<ExperienciasDto> getExperiencias() {
		return experiencias;
	}

	public void setExperiencias(List<ExperienciasDto> experiencias) {
		this.experiencias = experiencias;
	}
	
}
