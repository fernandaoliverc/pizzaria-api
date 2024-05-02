package br.com.fernanda.pizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernanda.pizzaria.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
