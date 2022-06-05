package com.redsocial.entityserviceempresasv1.api;

import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.redsocial.entityserviceempresasv1.service.EmpresasNoEncontradasException;

@RestControllerAdvice
public class ApiExceptionHandler {
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@ExceptionHandler(EmpresasNoEncontradasException.class)
	public HttpEntity notFound(EmpresasNoEncontradasException exception) {

		HashMap<String, Object> body = new HashMap<>();
		body.put("id", exception.getId());
		body.put("message", exception.getMessage());

		return (HttpEntity) ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
	}
}
