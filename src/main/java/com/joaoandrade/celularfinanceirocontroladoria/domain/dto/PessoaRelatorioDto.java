package com.joaoandrade.celularfinanceirocontroladoria.domain.dto;

import java.time.LocalDate;

public class PessoaRelatorioDto {

	private Long id;
	private String nome;
	private String telefone;
	private String dataCadastro;
	private String tipoPessoa;

	public PessoaRelatorioDto(Long id, String nome, String telefone, LocalDate dataCadastro, Boolean isPessoaFisica) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro.toString();
		this.tipoPessoa = isPessoaFisica ? "PF" : "PJ";
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

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

}
