package br.com.fernanda.pizzaria.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fernanda.pizzaria.entities.Cliente;
import br.com.fernanda.pizzaria.repositories.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	

	@PostMapping("/cadastrar")
	public Cliente cadastrarCliente(@RequestBody Cliente cliente) {

		return clienteRepository.save(cliente);
	}

	@GetMapping("/consultar")
	public List<Cliente>  consultarCliente() {
		return clienteRepository.findAll();
	}

	@GetMapping("/consultar/{idCliente}")
	public Optional<Cliente> consultarClienteId(@PathVariable Long idCliente) {
		return clienteRepository.findById(idCliente);
	}

	@PutMapping("/alterar/{idCliente}")
	public Cliente alterarClienteId(@PathVariable Long idCliente, @RequestBody Cliente cliente) {
		cliente.setIdCliente(idCliente);
		return clienteRepository.save(cliente);
	}

	@GetMapping("/deletar/{idCliente}")
	public String deletarClienteId(@PathVariable Long idCliente) {
		clienteRepository.deleteById(idCliente);
		return "Usuario excluido com Sucesso!";
	}

	
}
