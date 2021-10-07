package com.joaoandrade.celularfinanceirocontroladoria.api.input;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PessoaInput {
	@Size(min = 3, max = 255)
	@NotBlank
	private String nome;

	@Size(max = 11)
	@NotBlank
	private String telefone;

	@Valid
	private EnderecoInput endereco;

	public PessoaInput() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public EnderecoInput getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoInput endereco) {
		this.endereco = endereco;
	}

}
