package com.joaoandrade.celularfinanceirocontroladoria.domain.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaoandrade.celularfinanceirocontroladoria.domain.repository.PessoaRepository;
import com.joaoandrade.celularfinanceirocontroladoria.domain.service.relatorio.RelatorioService;

@Service
public class PessoaService {

	@Autowired
	private RelatorioService relatorioService;

	@Autowired
	private PessoaRepository pessoaRepository;

	public String gerarRelatorio(String nomeRelatorio) throws Exception {
		Map<String, Object> parametros = new HashMap<>();

		return relatorioService.gerarRelatorio(nomeRelatorio, parametros, pessoaRepository.buscarTodasParaRelatorio());
	}

}
