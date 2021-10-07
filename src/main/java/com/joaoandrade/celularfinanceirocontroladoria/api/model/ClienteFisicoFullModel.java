package com.joaoandrade.celularfinanceirocontroladoria.api.model;

public class ClienteFisicoFullModel extends PessoaModel {
	private String cpf;
	private EnderecoModel endereco;

	public ClienteFisicoFullModel() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public EnderecoModel getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoModel endereco) {
		this.endereco = endereco;
	}

}
