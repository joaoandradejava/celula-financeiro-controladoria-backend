package com.joaoandrade.celularfinanceirocontroladoria.domain.validator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joaoandrade.celularfinanceirocontroladoria.domain.exception.SistemaException;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteJuridico;
import com.joaoandrade.celularfinanceirocontroladoria.domain.repository.ClienteJuridicoRepository;

@Component
public class CnpjUnicoValidator {

	@Autowired
	private ClienteJuridicoRepository repository;

	public void validarCnpjUnico(ClienteJuridico clienteJuridico) {
		Optional<ClienteJuridico> obj = repository.findByCnpj(clienteJuridico.getCnpj());

		if (obj.isPresent() && !obj.get().equals(clienteJuridico)) {
			throw new SistemaException(
					String.format("Esse cnpj '%s' já pertence a um Cliente no sistema!", clienteJuridico.getCnpj()));
		}

	}
}
