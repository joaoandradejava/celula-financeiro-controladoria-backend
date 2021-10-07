package com.joaoandrade.celularfinanceirocontroladoria.api.disassembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joaoandrade.celularfinanceirocontroladoria.api.input.ClienteJuridicoInput;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteJuridico;

@Component
public class ClienteJuridicoInputDisassembler {

	@Autowired
	private ModelMapper modelMapper;

	public ClienteJuridico toDomainModel(ClienteJuridicoInput clienteJuridicoInput) {
		return modelMapper.map(clienteJuridicoInput, ClienteJuridico.class);
	}

	public void copyToDomainModel(ClienteJuridicoInput clienteJuridicoInput, ClienteJuridico clienteJuridico) {
		modelMapper.map(clienteJuridicoInput, clienteJuridico);
	}

}
