package com.joaoandrade.celularfinanceirocontroladoria.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joaoandrade.celularfinanceirocontroladoria.api.model.ClienteFisicoFullModel;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteFisico;

@Component
public class ClienteFisicoFullModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public ClienteFisicoFullModel toModel(ClienteFisico clienteFisico) {
		return modelMapper.map(clienteFisico, ClienteFisicoFullModel.class);
	}
}
