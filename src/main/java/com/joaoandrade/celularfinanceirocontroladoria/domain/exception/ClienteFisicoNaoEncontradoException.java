package com.joaoandrade.celularfinanceirocontroladoria.domain.exception;

public class ClienteFisicoNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;

	public ClienteFisicoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	public ClienteFisicoNaoEncontradoException(Long id) {
		super(String.format("O Cliente Físico de id %d não foi encontrado no sistema!", id));
	}
}
