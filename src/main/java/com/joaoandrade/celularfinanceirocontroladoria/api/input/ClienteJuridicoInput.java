package com.joaoandrade.celularfinanceirocontroladoria.api.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CNPJ;

public class ClienteJuridicoInput extends PessoaInput {

	@Size(max = 14)
	@CNPJ
	@NotBlank
	private String cnpj;

	public ClienteJuridicoInput() {
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
