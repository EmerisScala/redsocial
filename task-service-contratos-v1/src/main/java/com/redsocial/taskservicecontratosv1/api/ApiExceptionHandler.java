package com.redsocial.taskservicecontratosv1.api;

import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.redsocial.taskservicecontratosv1.service.DatosNoEncontradasException;

@RestControllerAdvice
public class ApiExceptionHandler {
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@ExceptionHandler(DatosNoEncontradasException.class)
	public HttpEntity notFound(DatosNoEncontradasException exception) {

		HashMap<String, Object> body = new HashMap<>();
		body.put("id", exception.getId());
		body.put("message", exception.getMessage());

		return (HttpEntity) ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
	}
}


