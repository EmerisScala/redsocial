package com.redsocial.taskservicecontratosv1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import com.redsocial.taskservicecontratosv1.model.ConfirmacionesDto;

@Entity
@Table(name = "confirmaciones")
public class Confirmaciones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String id;

	@NotEmpty
	@Column(name = "id_contrato")
	private String idContrato;
	
	@NotEmpty
	private Boolean estatus;
	
	@NotEmpty
	private String motivo;
	
	public static Confirmaciones from(ConfirmacionesDto confirmacionesDto) {
		Confirmaciones confirmaciones = new Confirmaciones();
		confirmaciones.setIdContrato(confirmacionesDto.getIdContrato());
		confirmaciones.setEstatus(confirmacionesDto.getEstatus());
		confirmaciones.setMotivo(confirmacionesDto.getMotivo());
		return confirmaciones;
	}

	public ConfirmacionesDto to() {
		ConfirmacionesDto confirmaciones = new ConfirmacionesDto();
		confirmaciones.setIdContrato(this.getIdContrato());
		confirmaciones.setEstatus(this.getEstatus());
		confirmaciones.setMotivo(this.getMotivo());
		return confirmaciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
