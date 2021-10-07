package com.joaoandrade.celularfinanceirocontroladoria.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joaoandrade.celularfinanceirocontroladoria.api.model.PessoaModel;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.Pessoa;

@Component
public class PessoaModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public PessoaModel toModel(Pessoa pessoa) {
		return modelMapper.map(pessoa, PessoaModel.class);
	}

	public List<PessoaModel> toCollectionModel(List<Pessoa> lista) {
		return lista.stream().map(pessoa -> toModel(pessoa)).collect(Collectors.toList());
	}
}
