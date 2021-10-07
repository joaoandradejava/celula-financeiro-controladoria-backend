package com.joaoandrade.celularfinanceirocontroladoria.api.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

public class ClienteFisicoInput extends PessoaInput {

	@Size(max = 11)
	@CPF
	@NotBlank
	private String cpf;

	public ClienteFisicoInput() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
