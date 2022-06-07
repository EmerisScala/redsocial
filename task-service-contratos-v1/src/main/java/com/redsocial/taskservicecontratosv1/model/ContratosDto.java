package com.redsocial.taskservicecontratosv1.model;

public class ContratosDto {
	private int id;
	private String idSolicitud;
	private String descripcion;
	private String beneficios;
	private Double montoSalario;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIdSolicitud() {
		return idSolicitud;
	}
	
	public void setIdSolicitud(String idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getBeneficios() {
		return beneficios;
	}
	
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public Double getMontoSalario() {
		return montoSalario;
	}

	public void setMontoSalario(Double montoSalario) {
		this.montoSalario = montoSalario;
	}
	
	
}
