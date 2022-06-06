package com.redsocial.taskservicecontratosv1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import com.redsocial.taskservicecontratosv1.model.VacantesDto;

@Entity
@Table(name = "vacantes")
public class Vacantes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String id;

	@NotEmpty
	@Column(name = "id_empresa")
	private String idEmpresa;
	
	@NotEmpty
	private String descripcion;
	
	@NotEmpty
	private String posicion;
	
	@NotEmpty
	private String puesto;
	
	public static Vacantes from(VacantesDto vacantesDto) {
		Vacantes vacantes = new Vacantes();
		vacantes.setIdEmpresa(vacantesDto.getIdEmpresa());
		vacantes.setPosicion(vacantesDto.getPosicion());
		vacantes.setPuesto(vacantesDto.getPuesto());
		vacantes.setDescripcion(vacantesDto.getDescripcion());
		return vacantes;
	}

	public VacantesDto to() {
		VacantesDto vacantes = new VacantesDto();
		vacantes.setIdEmpresa(this.getIdEmpresa());
		vacantes.setPosicion(this.getPosicion());
		vacantes.setPuesto(this.getPuesto());
		vacantes.setDescripcion(this.getDescripcion());
		return vacantes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

}
