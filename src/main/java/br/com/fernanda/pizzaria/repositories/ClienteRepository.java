package br.com.fernanda.pizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernanda.pizzaria.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}
