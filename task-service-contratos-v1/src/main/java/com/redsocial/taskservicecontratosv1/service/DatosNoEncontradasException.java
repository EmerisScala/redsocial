package com.redsocial.taskservicecontratosv1.service;

public class DatosNoEncontradasException extends RuntimeException {
	private final String id;

	public DatosNoEncontradasException(String message, String id) {
		super(message);
		this.id = id;
	}

	public static DatosNoEncontradasException from(String message, String id) {
		return new DatosNoEncontradasException(message, id);
	}

	public String getId() {
		return id;
	}
}
