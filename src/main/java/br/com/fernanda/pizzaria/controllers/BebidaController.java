package br.com.fernanda.pizzaria.controllers;

import java.util.List;
import java.util.Optional;

import br.com.fernanda.pizzaria.repositories.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fernanda.pizzaria.entities.Bebida;


@RestController
@RequestMapping("/bebida")
public class BebidaController {

    @Autowired
    private BebidaRepository bebidaRepository;

    @PostMapping("/cadastrar")
    public Bebida cadastrarBebida(@RequestBody Bebida bebida) {
        return bebidaRepository.save(bebida);
    }

    @GetMapping("/consultar")
    public List<Bebida> consultarBebida() {
        return bebidaRepository.findAll();
    }

    @GetMapping("/consultar/{idBebida}")
    public Optional<Bebida> consultarBebidaId(@PathVariable Long idBebida) {
        return bebidaRepository.findById(idBebida);
    }

    @PutMapping("/alterar/{idBebida}")
    public Bebida alterarBebidaId(@PathVariable Long idBebida, @RequestBody Bebida bebida) {
        bebida.setIdBebida(idBebida);
        return bebidaRepository.save(bebida);
    }

    @DeleteMapping("/deletar/{idBebida}")
    public String deletarBebidaId(@PathVariable Long idBebida) {
        bebidaRepository.deleteById(idBebida);
        return "Excluido com sucesso!";
    }

}
