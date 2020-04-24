package com.gersonjunior.ordensdeservico.domain.exception;

public class NegocioExceptio extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public NegocioExceptio(String message) {
		super(message);
	}
}
