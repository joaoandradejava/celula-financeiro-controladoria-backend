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

import com.joaoandrade.celularfinanceirocontroladoria.api.assembler.ClienteFisicoFullModelAssembler;
import com.joaoandrade.celularfinanceirocontroladoria.api.disassembler.ClienteFisicoInputDisassembler;
import com.joaoandrade.celularfinanceirocontroladoria.api.input.ClienteFisicoInput;
import com.joaoandrade.celularfinanceirocontroladoria.api.model.ClienteFisicoFullModel;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteFisico;
import com.joaoandrade.celularfinanceirocontroladoria.domain.service.crud.CrudClienteFisicoService;

@RestController
@RequestMapping("/clientes-fisicos")
public class ClienteFisicoController {

	@Autowired
	private CrudClienteFisicoService crudClienteFisicoService;

	@Autowired
	private ClienteFisicoFullModelAssembler clienteFisicoFullModelAssembler;

	@Autowired
	private ClienteFisicoInputDisassembler clienteFisicoInputDisassembler;

	@GetMapping("/{id}")
	public ClienteFisicoFullModel buscarPorId(@PathVariable Long id) {
		ClienteFisico clienteFisico = crudClienteFisicoService.buscarPorId(id);

		return clienteFisicoFullModelAssembler.toModel(clienteFisico);
	}

	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public ClienteFisicoFullModel salvar(@Valid @RequestBody ClienteFisicoInput clienteFisicoInput) {
		ClienteFisico clienteFisico = crudClienteFisicoService
				.salvar(clienteFisicoInputDisassembler.toDomainModel(clienteFisicoInput));

		return clienteFisicoFullModelAssembler.toModel(clienteFisico);
	}

	@PutMapping("/{id}")
	public ClienteFisicoFullModel atualizar(@Valid @RequestBody ClienteFisicoInput clienteFisicoInput,
			@PathVariable Long id) {
		ClienteFisico clienteFisico = crudClienteFisicoService.buscarPorId(id);
		clienteFisicoInputDisassembler.copyToDomainModel(clienteFisicoInput, clienteFisico);
		clienteFisico = crudClienteFisicoService.atualizar(clienteFisico);

		return clienteFisicoFullModelAssembler.toModel(clienteFisico);
	}
}
