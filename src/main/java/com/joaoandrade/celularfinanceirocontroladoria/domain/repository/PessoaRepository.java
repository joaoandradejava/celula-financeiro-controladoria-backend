package com.joaoandrade.celularfinanceirocontroladoria.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.joaoandrade.celularfinanceirocontroladoria.domain.dto.PessoaRelatorioDto;
import com.joaoandrade.celularfinanceirocontroladoria.domain.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	@Query("select new com.joaoandrade.celularfinanceirocontroladoria.domain.dto.PessoaRelatorioDto(p.id, p.nome, p.telefone, p.dataCadastro, p.isPessoaFisica) from Pessoa p")
	List<PessoaRelatorioDto> buscarTodasParaRelatorio();
}
