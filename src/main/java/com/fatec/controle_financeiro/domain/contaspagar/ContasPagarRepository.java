package com.fatec.controle_financeiro.domain.contaspagar;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.controle_financeiro.entities.ContasPagar;

public interface ContasPagarRepository extends JpaRepository<ContasPagar, Long> {
}
