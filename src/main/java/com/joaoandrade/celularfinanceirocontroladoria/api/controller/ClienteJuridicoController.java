package com.joaoandrade.celularfinanceirocontroladoria.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.joaoandrade.celularfinanceirocontroladoria.api.assembler.ClienteJuridicoFullModelAssembler;
import com.joaoandrade.celularfinanceirocontroladoria.api.disassembler.ClienteJuridicoInputDisassembler;
import com.joaoandrade.celularfinanceirocontroladoria.api.input.ClienteJuridicoInput;
import com.joaoandrade.celularfinanceirocontroladoria.api.model.ClienteJuridicoFullModel;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteJuridico;
import com.joaoandrade.celularfinanceirocontroladoria.domain.service.crud.CrudClienteJuridicoService;

@RestController
@RequestMapping("/clientes-juridicos")
public class ClienteJuridicoController {

	@Autowired
	private CrudClienteJuridicoService crudClienteJuridicoService;

	@Autowired
	private ClienteJuridicoFullModelAssembler clienteJuridicoFullModelAssembler;

	@Autowired
	private ClienteJuridicoInputDisassembler clienteJuridicoInputDisassembler;

	@GetMapping("/{id}")
	public ClienteJuridicoFullModel buscarPorId(@PathVariable Long id) {
		ClienteJuridico clienteJuridico = crudClienteJuridicoService.buscarPorId(id);

		return clienteJuridicoFullModelAssembler.toModel(clienteJuridico);
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public ClienteJuridicoFullModel salvar(@Valid @RequestBody ClienteJuridicoInput clienteJuridicoInput) {
		ClienteJuridico clienteJuridico = crudClienteJuridicoService
				.salvar(clienteJuridicoInputDisassembler.toDomainModel(clienteJuridicoInput));

		return clienteJuridicoFullModelAssembler.toModel(clienteJuridico);
	}

	@PutMapping("/{id}")
	public ClienteJuridicoFullModel atualizar(@Valid @RequestBody ClienteJuridicoInput clienteJuridicoInput,
			@PathVariable Long id) {
		ClienteJuridico clienteJuridico = crudClienteJuridicoService.buscarPorId(id);
		clienteJuridicoInputDisassembler.copyToDomainModel(clienteJuridicoInput, clienteJuridico);
		clienteJuridico = crudClienteJuridicoService.atualizar(clienteJuridico);

		return clienteJuridicoFullModelAssembler.toModel(clienteJuridico);
	}
}
