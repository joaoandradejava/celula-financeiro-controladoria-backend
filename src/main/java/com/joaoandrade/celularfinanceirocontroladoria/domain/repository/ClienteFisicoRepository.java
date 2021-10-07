package com.joaoandrade.celularfinanceirocontroladoria.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaoandrade.celularfinanceirocontroladoria.domain.model.ClienteFisico;

@Repository
public interface ClienteFisicoRepository extends JpaRepository<ClienteFisico, Long> {

	Optional<ClienteFisico> findByCpf(String cpf);

}
