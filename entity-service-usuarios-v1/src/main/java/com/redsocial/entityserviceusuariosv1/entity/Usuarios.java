package com.redsocial.entityserviceusuariosv1.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.redsocial.entityserviceusuariosv1.model.UsuariosDto;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
	private  static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(updatable = false, name = "numero")
	private String numero;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	@Column(name = "apellido_paterno")
	private String apellidoPaterno;
	
	@NotEmpty
	@Column(name = "apellido_materno")
	private String apellidoMaterno;
	
	@NotEmpty
	private String correo;
	
	@NotEmpty
	private String contrasenia;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "numero_usuario")
	private List<Certificados> certificados;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "numero_usuario")
	private List<Experiencias> experiencias;
	
	public static Usuarios from(UsuariosDto usuarioDto) {
		Usuarios usuario = new Usuarios();
		usuario.setNombre(usuarioDto.getNombre());
		usuario.setApellidoPaterno(usuarioDto.getApellidoPaterno());
		usuario.setApellidoMaterno(usuarioDto.getApellidoMaterno());
		usuario.setCorreo(usuarioDto.getCorreo());
		usuario.setContrasenia(usuarioDto.getContrasenia());
		return usuario;
	}
	
	public UsuariosDto to() {
		UsuariosDto usuario = new UsuariosDto();
		usuario.setNombre(this.getNombre());
		usuario.setApellidoPaterno(this.getApellidoPaterno());
		usuario.setApellidoMaterno(this.getApellidoMaterno());
		usuario.setCorreo(this.getCorreo());
		usuario.setContrasenia(this.getContrasenia());
		return usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@JsonIgnore
	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<Certificados> getCertificados() {
		return certificados;
	}

	public void setCertificados(List<Certificados> certificados) {
		this.certificados = certificados;
	}

	public List<Experiencias> getExperiencias() {
		return experiencias;
	}

	public void setExperiencias(List<Experiencias> experiencias) {
		this.experiencias = experiencias;
	}
	
	
}
