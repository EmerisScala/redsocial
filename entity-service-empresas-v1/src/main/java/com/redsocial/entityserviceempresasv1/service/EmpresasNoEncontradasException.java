package com.redsocial.entityserviceempresasv1.service;

public class EmpresasNoEncontradasException extends RuntimeException {
	private final String id;

	public EmpresasNoEncontradasException(String message, String id) {
		super(message);
		this.id = id;
	}

	public static EmpresasNoEncontradasException from(String message, String id) {
		return new EmpresasNoEncontradasException(message, id);
	}

	public String getId() {
		return id;
	}
}
