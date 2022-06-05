package com.redsocial.entityserviceusuariosv1.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.redsocial.entityserviceusuariosv1.model.CertificadosDto;

@Entity
@Table(name = "certificados")
public class Certificados {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false)
	private String id;

	@NotEmpty
	@Column(name = "nombre")
	private String nombre;

	@NotEmpty
	@Column(name = "empresa_emisora")
	private String empresaEmisora;

	@NotEmpty
	@Column(name = "fecha_expedicion")
	private Timestamp fechaExpedicion;

	@NotEmpty
	@Column(name = "url_credencial")
	private String urlCredencial;
	
	@NotEmpty
	@JsonIgnore
	@Column(name = "numero_usuario")
	private String numeroUsuario;

	public static Certificados from(CertificadosDto certificadosDto) {
		Certificados certificados = new Certificados();
		certificados.setEmpresaEmisora(certificadosDto.getEmpresaEmisora());
		certificados.setNombre(certificadosDto.getNombre());
		certificados.setFechaExpedicion(certificadosDto.getFechaExpedicion());
		certificados.setUrlCredencial(certificadosDto.getUrlCredencial());
		certificados.setNumeroUsuario(certificadosDto.getNumeroUsuario());
		return certificados;
	}

	public CertificadosDto to() {
		CertificadosDto certificados = new CertificadosDto();
		certificados.setEmpresaEmisora(this.getEmpresaEmisora());
		certificados.setNombre(this.getNombre());
		certificados.setFechaExpedicion(this.getFechaExpedicion());
		certificados.setUrlCredencial(this.getUrlCredencial());
		certificados.setNumeroUsuario(this.getNumeroUsuario());
		return certificados;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpresaEmisora() {
		return empresaEmisora;
	}

	public void setEmpresaEmisora(String empresaEmisora) {
		this.empresaEmisora = empresaEmisora;
	}

	public Timestamp getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(Timestamp fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public String getUrlCredencial() {
		return urlCredencial;
	}

	public void setUrlCredencial(String urlCredencial) {
		this.urlCredencial = urlCredencial;
	}

	public String getNumeroUsuario() {
		return numeroUsuario;
	}

	public void setNumeroUsuario(String numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}

}
