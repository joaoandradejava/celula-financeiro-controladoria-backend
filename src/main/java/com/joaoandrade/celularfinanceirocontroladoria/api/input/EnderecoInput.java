package com.joaoandrade.celularfinanceirocontroladoria.api.input;

import javax.validation.constraints.Size;

public class EnderecoInput {

	@Size(max = 8)
	private String cep;
	@Size(max = 255)
	private String rua;
	@Size(max = 255)
	private String numero;
	@Size(max = 255)
	private String complemento;
	@Size(max = 255)
	private String bairro;
	@Size(max = 255)
	private String cidade;
	@Size(max = 255)
	private String uf;

	public EnderecoInput() {
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
