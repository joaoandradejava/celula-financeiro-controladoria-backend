package com.joaoandrade.celularfinanceirocontroladoria.domain.model;

import javax.persistence.Entity;

@Entity
public class ClienteFisico extends Pessoa {
	private String cpf;

	public ClienteFisico() {
	}

	public ClienteFisico(Long id, String nome, Endereco endereco, String telefone, String cpf) {
		super(id, nome, endereco, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
