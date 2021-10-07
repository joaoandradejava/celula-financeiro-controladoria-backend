package com.joaoandrade.celularfinanceirocontroladoria.domain.validator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joaoandrade.celularfinanceirocontroladoria.domain.exception.SistemaException;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteFisico;
import com.joaoandrade.celularfinanceirocontroladoria.domain.repository.ClienteFisicoRepository;

@Component
public class CpfUnicoValidator {

	@Autowired
	private ClienteFisicoRepository repository;

	public void validarCpfUnico(ClienteFisico clienteFisico) {
		Optional<ClienteFisico> obj = repository.findByCpf(clienteFisico.getCpf());

		if (obj.isPresent() && !obj.get().equals(clienteFisico)) {
			throw new SistemaException(
					String.format("Esse cpf '%s' já pertence a um Cliente no sistema!", clienteFisico.getCpf()));
		}

	}
}
