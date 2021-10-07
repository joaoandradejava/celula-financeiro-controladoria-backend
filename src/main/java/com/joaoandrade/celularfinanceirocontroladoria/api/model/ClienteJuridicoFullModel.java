package com.joaoandrade.celularfinanceirocontroladoria.api.model;

public class ClienteJuridicoFullModel extends PessoaModel {
	private String cnpj;
	private EnderecoModel endereco;

	public ClienteJuridicoFullModel() {
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public EnderecoModel getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoModel endereco) {
		this.endereco = endereco;
	}

}
