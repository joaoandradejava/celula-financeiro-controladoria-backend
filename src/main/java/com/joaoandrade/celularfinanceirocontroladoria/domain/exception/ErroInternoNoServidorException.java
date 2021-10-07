package com.joaoandrade.celularfinanceirocontroladoria.domain.exception;

public class ErroInternoNoServidorException extends SistemaException {

	private static final long serialVersionUID = 1L;

	public ErroInternoNoServidorException(String mensagem) {
		super(mensagem);
	}
}
