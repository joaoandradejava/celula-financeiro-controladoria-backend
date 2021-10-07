package com.joaoandrade.celularfinanceirocontroladoria.domain.service.crud;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaoandrade.celularfinanceirocontroladoria.domain.exception.ClienteJuridicoNaoEncontradoException;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteJuridico;
import com.joaoandrade.celularfinanceirocontroladoria.domain.repository.ClienteJuridicoRepository;
import com.joaoandrade.celularfinanceirocontroladoria.domain.validator.CnpjUnicoValidator;

@Service
public class CrudClienteJuridicoService {

	@Autowired
	private ClienteJuridicoRepository repository;

	@Autowired
	private CnpjUnicoValidator cnpjUnicoValidator;

	@Autowired
	private EntityManager entityManager;

	public ClienteJuridico buscarPorId(Long id) {
		return repository.findById(id).orElseThrow(() -> new ClienteJuridicoNaoEncontradoException(id));
	}

	@Transactional
	public ClienteJuridico salvar(ClienteJuridico clienteJuridico) {
		cnpjUnicoValidator.validarCnpjUnico(clienteJuridico);

		return repository.save(clienteJuridico);
	}

	@Transactional
	public ClienteJuridico atualizar(ClienteJuridico clienteJuridico) {
		entityManager.detach(clienteJuridico);
		cnpjUnicoValidator.validarCnpjUnico(clienteJuridico);

		return repository.save(clienteJuridico);
	}

}
