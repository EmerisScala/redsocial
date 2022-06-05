package com.redsocial.entityserviceempresasv1.model;

public class EmpresasDto {
	int id;
	private String nombre;
	private String numeroUsuarioEncargado;
	private String contrasenia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
}