package com.redsocial.taskservicecontratosv1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import com.redsocial.taskservicecontratosv1.model.SolicitudesDto;

@Entity
@Table(name = "solicitudes")
public class Solicitudes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String id;

	@NotEmpty
	@Column(name = "id_vacante")
	private String idVacante;

	@NotEmpty
	@Column(name = "numero_usuario")
	private String numeroUsuario;

	public static Solicitudes from(SolicitudesDto solicitudesDto) {
		Solicitudes solicitudes = new Solicitudes();
		solicitudes.setIdVacante(solicitudesDto.getIdVacante());
		solicitudes.setNumeroUsuario(solicitudesDto.getNumeroUsuario());
		return solicitudes;
	}

	public SolicitudesDto to() {
		SolicitudesDto solicitudes = new SolicitudesDto();
		solicitudes.setIdVacante(this.getIdVacante());
		solicitudes.setNumeroUsuario(this.getNumeroUsuario());
		return solicitudes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdVacante() {
		return idVacante;
	}

	public void setIdVacante(String idVacante) {
		this.idVacante = idVacante;
	}

	public String getNumeroUsuario() {
		return numeroUsuario;
	}

	public void setNumeroUsuario(String numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}

}
