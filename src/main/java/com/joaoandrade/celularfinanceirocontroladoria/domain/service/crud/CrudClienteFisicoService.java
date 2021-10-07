package com.joaoandrade.celularfinanceirocontroladoria.domain.service.crud;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaoandrade.celularfinanceirocontroladoria.domain.exception.ClienteFisicoNaoEncontradoException;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteFisico;
import com.joaoandrade.celularfinanceirocontroladoria.domain.repository.ClienteFisicoRepository;
import com.joaoandrade.celularfinanceirocontroladoria.domain.validator.CpfUnicoValidator;

@Service
public class CrudClienteFisicoService {

	@Autowired
	private ClienteFisicoRepository repository;

	@Autowired
	private CpfUnicoValidator cpfUnicoValidator;

	@Autowired
	private EntityManager entityManager;

	public ClienteFisico buscarPorId(Long id) {
		return repository.findById(id).orElseThrow(() -> new ClienteFisicoNaoEncontradoException(id));
	}

	@Transactional
	public ClienteFisico salvar(ClienteFisico clienteFisico) {
		cpfUnicoValidator.validarCpfUnico(clienteFisico);
		clienteFisico.setIsPessoaFisica(true);

		return repository.save(clienteFisico);
	}

	@Transactional
	public ClienteFisico atualizar(ClienteFisico clienteFisico) {
		entityManager.detach(clienteFisico);
		cpfUnicoValidator.validarCpfUnico(clienteFisico);

		return repository.save(clienteFisico);
	}

}
