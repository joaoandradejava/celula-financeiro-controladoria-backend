package com.joaoandrade.celularfinanceirocontroladoria.domain.service.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaoandrade.celularfinanceirocontroladoria.domain.exception.PessoaNaoEncontradaException;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.Pessoa;
import com.joaoandrade.celularfinanceirocontroladoria.domain.repository.PessoaRepository;

@Service
public class CrudPessoaService {

	@Autowired
	private PessoaRepository repository;

	public Page<Pessoa> buscarTodos(Pageable pageable) {
		return repository.findAll(pageable);
	}

	private Pessoa buscarPorId(Long id) {
		return repository.findById(id).orElseThrow(() -> new PessoaNaoEncontradaException(id));
	}

	@Transactional
	public void deletarPorId(Long id) {
		buscarPorId(id);

		repository.deleteById(id);

	}

}
