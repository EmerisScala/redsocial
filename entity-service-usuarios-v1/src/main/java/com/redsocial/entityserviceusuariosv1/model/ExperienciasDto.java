package com.redsocial.entityserviceusuariosv1.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ExperienciasDto {
	int id;
	private String numeroUsuario;
	private String empresa;
	private String Puesto;
	private Date fechaInicio;
	private Date fechaTermino;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNumeroUsuario() {
		return numeroUsuario;
	}
	
	public void setNumeroUsuario(String numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public String getPuesto() {
		return Puesto;
	}
	
	public void setPuesto(String puesto) {
		Puesto = puesto;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaTermino() {
		return fechaTermino;
	}
	
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	
	
}
