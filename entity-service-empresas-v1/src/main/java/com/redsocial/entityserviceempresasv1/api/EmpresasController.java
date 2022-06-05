package com.redsocial.entityserviceempresasv1.api;

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

import com.redsocial.entityserviceempresasv1.entity.Empresas;
import com.redsocial.entityserviceempresasv1.model.EmpresasDto;
import com.redsocial.entityserviceempresasv1.model.TemplateResponse;
import com.redsocial.entityserviceempresasv1.service.EmpresasServiceImpl;

@RestController
@RequestMapping("empresas/v1")
public class EmpresasController {
	private static final Logger log = Logger.getLogger(EmpresasController.class.getName());
	
	@Autowired
	private EmpresasServiceImpl empresasServiceImpl;
	
	@PostMapping("/empresas")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TemplateResponse crear(@RequestBody EmpresasDto empresa) {
		log.info(">>> usuarios /v1 creando usuario");

		Empresas empresas = empresasServiceImpl.guardar(empresa);

		TemplateResponse response = new TemplateResponse("Empresa se ha creado exitosamente", "201", empresas);

		return response;
	}
	
	@GetMapping("empresas/{idEmpresa}")
	@ResponseStatus(code = HttpStatus.OK)
	public TemplateResponse obtenerEmpresaById(@PathVariable("idEmpresa") String id) {
		log.info(">>> empleados/v1 obtenerEmpleadoById ");
		Empresas empresa = empresasServiceImpl.obtenerById(id);
		return new TemplateResponse("Operación Exitosa", "200", empresa);
	}
}
