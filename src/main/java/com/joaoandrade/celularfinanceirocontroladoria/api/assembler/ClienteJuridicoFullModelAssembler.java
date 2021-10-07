package com.joaoandrade.celularfinanceirocontroladoria.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joaoandrade.celularfinanceirocontroladoria.api.model.ClienteJuridicoFullModel;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteJuridico;

@Component
public class ClienteJuridicoFullModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public ClienteJuridicoFullModel toModel(ClienteJuridico clienteJuridico) {
		return modelMapper.map(clienteJuridico, ClienteJuridicoFullModel.class);
	}
}
