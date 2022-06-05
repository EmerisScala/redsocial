package com.redsocial.entityserviceusuariosv1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.redsocial.entityserviceusuariosv1.model.ExperienciasDto;

@Entity
@Table(name = "experiencias")
public class Experiencias {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String id;
	
	@JsonIgnore
	@NotEmpty
	@Column(name = "numero_usuario")
	private String numeroUsuario;

	@NotEmpty
	private String empresa;

	@NotEmpty
	private String puesto;

	@NotEmpty
	@Column(name = "fecha_inicio")
	private Date fechaInicio;

	@NotEmpty
	@Column(name = "fecha_termino")
	private Date fechaTermino;

	public static Experiencias from(ExperienciasDto experienciasDto) {
		Experiencias experiencia = new Experiencias();
		experiencia.setEmpresa(experienciasDto.getEmpresa());
		experiencia.setNumeroUsuario(experienciasDto.getNumeroUsuario());
		experiencia.setPuesto(experienciasDto.getPuesto());
		experiencia.setFechaInicio(experienciasDto.getFechaInicio());
		experiencia.setFechaTermino(experienciasDto.getFechaTermino());
		return experiencia;
	}

	public ExperienciasDto to() {
		ExperienciasDto experiencia = new ExperienciasDto();
		experiencia.setEmpresa(this.getEmpresa());
		experiencia.setNumeroUsuario(this.getNumeroUsuario());
		experiencia.setPuesto(this.getPuesto());
		experiencia.setFechaInicio(this.getFechaInicio());
		experiencia.setFechaTermino(this.getFechaTermino());
		return experiencia;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
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
