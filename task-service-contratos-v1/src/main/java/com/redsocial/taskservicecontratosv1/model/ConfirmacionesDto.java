package com.redsocial.taskservicecontratosv1.model;

public class ConfirmacionesDto {
	int id;
	private String idContrato;
	private Boolean estatus;
	private String motivo;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIdContrato() {
		return idContrato;
	}
	
	public void setIdContrato(String idContrato) {
		this.idContrato = idContrato;
	}
	
	public Boolean getEstatus() {
		return estatus;
	}

	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	public String getMotivo() {
		return motivo;
	}
	
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
}
