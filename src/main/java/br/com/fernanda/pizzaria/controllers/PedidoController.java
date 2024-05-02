package br.com.fernanda.pizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fernanda.pizzaria.entities.Pedido;
import br.com.fernanda.pizzaria.repositories.PedidoRepository;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	PedidoRepository pedidoRepository;

	@PostMapping("/criar")
	public Pedido criarPedido(@RequestBody Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

}
