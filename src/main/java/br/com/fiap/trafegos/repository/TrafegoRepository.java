package br.com.fiap.trafegos.repository;

import br.com.fiap.trafegos.model.Trafego;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrafegoRepository extends JpaRepository<Trafego,Long> {

    Optional<Trafego> findByEstado(String estado);
}

