package com.joaoandrade.celularfinanceirocontroladoria.domain.model;

import javax.persistence.Entity;

@Entity
public class ClienteJuridico extends Pessoa {
	private String cnpj;

	public ClienteJuridico() {
	}

	public ClienteJuridico(Long id, String nome, Endereco endereco, String telefone, String cnpj) {
		super(id, nome, endereco, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
