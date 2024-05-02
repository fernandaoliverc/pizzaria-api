package br.com.fernanda.pizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernanda.pizzaria.entities.Bebida;

public interface BebidaRepository extends JpaRepository<Bebida, Long> {

}
