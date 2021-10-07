package com.joaoandrade.celularfinanceirocontroladoria.api.exceptionhandler;

public enum Error {

	SISTEMA_EXCEPTION("erro-client-side", "Ocorreu um erro do lado do client-side(front)"),
	ENTIDADE_NAO_ENCONTRADA("entidade-nao-encontrada", "Entidade não encontrada"),
	ERRO_VALIDACAO_DADOS("erro-validacao-dados", "Erro de validação dos dados"),
	ERRO_INTERNO_NO_SERVIDOR("erro-interno-servidor", "Erro interno no servidor"),
	ERRO_DESSERIALIZACAO_JSON("erro-desserializacao-json", "Erro na desserialização do JSON"),
	PROPRIEDADE_INEXISTENTE("propriedade-inexistente", "Propriedade inexistente");

	private String type;
	private String title;

	private Error(String type, String title) {
		this.type = "https://www.joaoandradejava.com.br/" + type;
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public String getTitle() {
		return title;
	}

}
