package com.redsocial.taskservicecontratosv1.api;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.taskservicecontratosv1.entity.Confirmaciones;
import com.redsocial.taskservicecontratosv1.entity.Contratos;
import com.redsocial.taskservicecontratosv1.entity.Solicitudes;
import com.redsocial.taskservicecontratosv1.entity.Vacantes;
import com.redsocial.taskservicecontratosv1.model.ConfirmacionesDto;
import com.redsocial.taskservicecontratosv1.model.ContratosDto;
import com.redsocial.taskservicecontratosv1.model.SolicitudesDto;
import com.redsocial.taskservicecontratosv1.model.TemplateResponse;
import com.redsocial.taskservicecontratosv1.model.VacantesDto;
import com.redsocial.taskservicecontratosv1.service.ConfirmacionesServiceImpl;
import com.redsocial.taskservicecontratosv1.service.ContratosServiceImpl;
import com.redsocial.taskservicecontratosv1.service.SolicitudesServiceImpl;
import com.redsocial.taskservicecontratosv1.service.VacantesServiceImpl;

@RestController
@RequestMapping("contratos/v1")
public class ContratosController {
	private static final Logger log = Logger.getLogger(ContratosController.class.getName());

	@Autowired
	private ConfirmacionesServiceImpl confirmacionesServiceImpl;

	@Autowired
	private ContratosServiceImpl contratosServiceImpl;

	@Autowired
	private SolicitudesServiceImpl solicitudesServiceImpl;

	@Autowired
	private VacantesServiceImpl vacantesServiceImpl;

	@PostMapping("/contratos/vacantes")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TemplateResponse crearVacante(@RequestBody VacantesDto vacante) {
		log.info(">>> contratos /v1 creando vacante");

		Vacantes vacantes = vacantesServiceImpl.guardar(vacante);

		TemplateResponse response = new TemplateResponse("Vacante se ha creado exitosamente", "201", vacantes);

		return response;
	}

	@GetMapping("/contratos/vacantes/{idVacante}")
	@ResponseStatus(code = HttpStatus.OK)
	public TemplateResponse obtenerVacanteById(@PathVariable("idVacante") String id) {
		log.info(">>> contratos/v1 obtenerVacantesById ");
		Vacantes vacante = vacantesServiceImpl.obtenerById(id);
		return new TemplateResponse("Operación Exitosa", "200", vacante);
	}

	@PostMapping("/contratos/solicitudes")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TemplateResponse crearSolicitud(@RequestBody SolicitudesDto solicitud) {
		log.info(">>> contratos /v1 creando solicitud");

		Solicitudes solicitudes = solicitudesServiceImpl.guardar(solicitud);

		TemplateResponse response = new TemplateResponse("Solicitud se ha creado exitosamente", "201", solicitudes);

		return response;
	}

	@GetMapping("/contratos/solcitudes/{idSolicitud}")
	@ResponseStatus(code = HttpStatus.OK)
	public TemplateResponse obtenerSolicitudById(@PathVariable("idVacante") String id) {
		log.info(">>> contratos/v1 obtenerVacantesById ");
		Solicitudes solicitud = solicitudesServiceImpl.obtenerById(id);
		return new TemplateResponse("Operación Exitosa", "200", solicitud);
	}

	@PostMapping("/contratos")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TemplateResponse crearContrato(@RequestBody ContratosDto contrato) {
		log.info(">>> contratos /v1 creando contrato");
		Contratos contratos = contratosServiceImpl.guardar(contrato);
		TemplateResponse response = new TemplateResponse("Solicitud se ha creado exitosamente", "201", contratos);

		return response;
	}

	@GetMapping("/contratos/{idContrato}")
	@ResponseStatus(code = HttpStatus.OK)
	public TemplateResponse obtenerContratoById(@PathVariable("idContrato") String id) {
		log.info(">>> contratos/v1 obtenerContatosById ");
		Contratos contratos = contratosServiceImpl.obtenerById(id);
		return new TemplateResponse("Operación Exitosa", "200", contratos);
	}

	@PostMapping("/contratos/confirmaciones")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TemplateResponse crearConfirmacion(@RequestBody ConfirmacionesDto confirmacion) {
		log.info(">>> contratos /v1 creando confirmacion");
		Confirmaciones confirmaciones = confirmacionesServiceImpl.guardar(confirmacion);
		TemplateResponse response = new TemplateResponse("Solicitud se ha creado exitosamente", "201", confirmaciones);

		return response;
	}

	@GetMapping("/contratos/confirmaciones/{idConfirmacion}")
	@ResponseStatus(code = HttpStatus.OK)
	public TemplateResponse obtenerConfirmacionById(@PathVariable("idConfirmacion") String id) {
		log.info(">>> contratos/v1 obtenerConfirmacionById ");
		Confirmaciones confirmaciones = confirmacionesServiceImpl.obtenerById(id);
		return new TemplateResponse("Operación Exitosa", "200", confirmaciones);
	}

	@PutMapping("contratos/confirmaciones/{idConfirmacion}")
	@ResponseStatus(code = HttpStatus.OK)
	public TemplateResponse modificarConfirmaciones(@PathVariable("idConfirmacion") String id,
			@RequestBody ConfirmacionesDto confirmacionesDto) {
		log.info(">>> contratos/v1 modificar confirmacion ");

		Confirmaciones confirmaciones = confirmacionesServiceImpl.modificar(id, confirmacionesDto);

		TemplateResponse response = new TemplateResponse("El Cliente se ha actualizado exitosamente", "200",
				confirmaciones);

		return response;

	}

}
