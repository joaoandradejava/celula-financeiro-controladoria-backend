package com.joaoandrade.celularfinanceirocontroladoria.domain.service.relatorio;

import java.util.List;
import java.util.Map;

public interface RelatorioService {

	public String gerarRelatorio(String nomeRelatorio, Map<String, Object> parametros, List<?> colecao)
			throws Exception;
}
