package com.redsocial.entityserviceusuariosv1.api;

import static org.springframework.http.HttpStatus.CREATED;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entityserviceusuariosv1.entity.Certificados;
import com.redsocial.entityserviceusuariosv1.entity.Experiencias;
import com.redsocial.entityserviceusuariosv1.entity.Usuarios;
import com.redsocial.entityserviceusuariosv1.model.CertificadosDto;
import com.redsocial.entityserviceusuariosv1.model.ExperienciasDto;
import com.redsocial.entityserviceusuariosv1.model.TemplateResponse;
import com.redsocial.entityserviceusuariosv1.model.UsuariosDto;
import com.redsocial.entityserviceusuariosv1.service.CertificadosServiceImpl;
import com.redsocial.entityserviceusuariosv1.service.ExperienciasServiceImpl;
import com.redsocial.entityserviceusuariosv1.service.UsuariosServiceImpl;

@RestController
@RequestMapping("usuarios/v1")
public class UsuariosController {
	private static final Logger log = Logger.getLogger(UsuariosController.class.getName());
	
	@Autowired
	private UsuariosServiceImpl usuariosServiceImpl;
	
	@Autowired
	private CertificadosServiceImpl certificadosServiceImpl;
	
	@Autowired
	private ExperienciasServiceImpl experienciasServiceImpl;
	
	@PostMapping("/usuarios")
	@ResponseStatus(CREATED)
	public TemplateResponse crear(@RequestBody UsuariosDto usuario) {
		log.info(">>> usuarios /v1 creando usuario");

		Usuarios usuarios = usuariosServiceImpl.guardar(usuario);

		TemplateResponse response = new TemplateResponse("El usuario se ha creado exitosamente", "201", usuarios);

		return response;
	}
	
	@PostMapping("/usuarios/{numeroUsuario}/certificados")
	@ResponseStatus(CREATED)
	public TemplateResponse crearCertificado(@RequestBody CertificadosDto certificado, @PathVariable("numeroUsuario") String numeroUsuario) {
		log.info(">>> usuarios/v1/{numeroUsuario}/certificados registro de certificado");
		
		certificado.setNumeroUsuario(numeroUsuario);
		Certificados certificados = certificadosServiceImpl.guardar(certificado);

		TemplateResponse response = new TemplateResponse("El usuario se ha creado exitosamente", "201", certificados);

		return response;
	}
	
	@PostMapping("/usuarios/{numeroUsuario}/experiencias")
	@ResponseStatus(CREATED)
	public TemplateResponse crearExperiencia(@RequestBody ExperienciasDto experiencia, @PathVariable("numeroUsuario") String numeroUsuario) {
		log.info(">>> usuarios/v1/{numeroUsuario}/experiencias registro de certificado");
		
		experiencia.setNumeroUsuario(numeroUsuario);
		Experiencias experiencias = experienciasServiceImpl.guardar(experiencia);

		TemplateResponse response = new TemplateResponse("El usuario se ha creado exitosamente", "201", experiencias);

		return response;
	}
	
	@GetMapping("usuarios/{numeroUsuario}")
	@ResponseStatus(code = HttpStatus.OK)
	public TemplateResponse obtenerEmpleadoById(@PathVariable("numeroUsuario") String id) {
		log.info(">>> empleados/v1 obtenerEmpleadoById ");
		Usuarios usuario = usuariosServiceImpl.obtenerById(id);
		usuario.setContrasenia(null);
		return new TemplateResponse("Operación Exitosa", "200", usuario);
	}

}
