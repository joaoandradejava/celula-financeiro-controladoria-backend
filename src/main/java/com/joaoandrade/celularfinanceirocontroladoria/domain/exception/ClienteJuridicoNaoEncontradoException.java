package com.joaoandrade.celularfinanceirocontroladoria.domain.exception;

public class ClienteJuridicoNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public ClienteJuridicoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	public ClienteJuridicoNaoEncontradoException(Long id) {
		super(String.format("O Cliente Juridico de id %d não foi encontrado no sistema!", id));
	}
}
