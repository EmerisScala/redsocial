package com.redsocial.taskservicecontratosv1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import com.redsocial.taskservicecontratosv1.model.ContratosDto;

@Entity
@Table(name = "contratos")
public class Contratos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String id;

	@NotEmpty
	@Column(name = "id_solicitud")
	private String idSolicitud;

	@NotEmpty
	private String descripcion;

	@NotEmpty
	private String beneficios;

	@NotEmpty
	@Column(name = "monto_salario", precision = 8, scale = 2)
	private Double montoSalario;

	public static Contratos from(ContratosDto contratosDto) {
		Contratos contratos = new Contratos();
		contratos.setIdSolicitud(contratosDto.getIdSolicitud());
		contratos.setDescripcion(contratosDto.getDescripcion());
		contratos.setBeneficios(contratosDto.getBeneficios());
		contratos.setMontoSalario(contratosDto.getMontoSalario());
		return contratos;
	}

	public ContratosDto to() {
		ContratosDto contratos = new ContratosDto();
		contratos.setIdSolicitud(this.getIdSolicitud());
		contratos.setDescripcion(this.getDescripcion());
		contratos.setBeneficios(this.getBeneficios());
		contratos.setMontoSalario(this.getMontoSalario());
		return contratos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
