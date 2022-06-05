package com.redsocial.entityserviceusuariosv1.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class CertificadosDto {
	private int id;
	private String numeroUsuario;
	private String nombre;
	private String empresaEmisora;
	private Timestamp fechaExpedicion;
	private String urlCredencial;
	
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
