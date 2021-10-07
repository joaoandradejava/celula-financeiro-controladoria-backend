package com.joaoandrade.celularfinanceirocontroladoria.api.disassembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joaoandrade.celularfinanceirocontroladoria.api.input.ClienteFisicoInput;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteFisico;

@Component
public class ClienteFisicoInputDisassembler {

	@Autowired
	private ModelMapper modelMapper;

	public ClienteFisico toDomainModel(ClienteFisicoInput clienteFisicoInput) {
		return modelMapper.map(clienteFisicoInput, ClienteFisico.class);
	}

	public void copyToDomainModel(ClienteFisicoInput clienteFisicoInput, ClienteFisico clienteFisico) {
		modelMapper.map(clienteFisicoInput, clienteFisico);
	}
}
