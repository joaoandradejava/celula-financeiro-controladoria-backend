package com.joaoandrade.celularfinanceirocontroladoria.api.model;

import java.time.LocalDate;

public class PessoaModel {
	private Long id;
	private String nome;
	private String telefone;
	private LocalDate dataCadastro;
	private Boolean isPessoaFisica;

	public PessoaModel() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setIsPessoaFisica(Boolean isPessoaFisica) {
		this.isPessoaFisica = isPessoaFisica;
	}

	public String getTipoDePessoa() {
		return isPessoaFisica ? "PF" : "PJ";
	}

}
