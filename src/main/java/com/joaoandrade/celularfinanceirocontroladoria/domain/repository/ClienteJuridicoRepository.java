package com.joaoandrade.celularfinanceirocontroladoria.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteJuridico;

@Repository
public interface ClienteJuridicoRepository extends JpaRepository<ClienteJuridico, Long> {

	Optional<ClienteJuridico> findByCnpj(String cnpj);

}
