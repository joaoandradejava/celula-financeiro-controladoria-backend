package com.joaoandrade.celularfinanceirocontroladoria.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.joaoandrade.celularfinanceirocontroladoria.api.assembler.PessoaModelAssembler;
import com.joaoandrade.celularfinanceirocontroladoria.api.model.PessoaModel;
import com.joaoandrade.celularfinanceirocontroladoria.api.model.RelatorioModel;
import com.joaoandrade.celularfinanceirocontroladoria.domain.exception.ErroInternoNoServidorException;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.Pessoa;
import com.joaoandrade.celularfinanceirocontroladoria.domain.service.PessoaService;
import com.joaoandrade.celularfinanceirocontroladoria.domain.service.crud.CrudPessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private CrudPessoaService crudPessoaService;

	@Autowired
	private PessoaModelAssembler pessoaModelAssembler;

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	public Page<PessoaModel> buscarTodos(Pageable pageable) {
		Page<Pessoa> page = crudPessoaService.buscarTodos(pageable);

		return page.map(x -> pessoaModelAssembler.toModel(x));
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void deletarPorId(@PathVariable Long id) {
		crudPessoaService.deletarPorId(id);
	}

	@GetMapping("/relatorio")
	public RelatorioModel gerarRelatorio() {
		try {
			String relatorioPDF = pessoaService.gerarRelatorio("Pessoa");

			return new RelatorioModel(relatorioPDF);
		} catch (Exception e) {
			throw new ErroInternoNoServidorException("Aconteu um erro inesperado na geração de Relatorio das Pessoas");
		}
	}
}
