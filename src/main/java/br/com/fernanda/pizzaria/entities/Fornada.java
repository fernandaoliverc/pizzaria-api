package br.com.fernanda.pizzaria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fornada")
public class Fornada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFornada;

	@Column
	private Integer numeroFornada;

	@Column
	private Integer quantidadePizzas;

	public Fornada(Integer numeroFornada, Integer quantidadePizzas) {
		this.numeroFornada = numeroFornada;
		this.quantidadePizzas = quantidadePizzas;
	}

	public Fornada() {

	}

	public Long getIdFornada() {
		return idFornada;
	}

	public void setIdFornada(Long idFornada) {
		this.idFornada = idFornada;
	}

	public Integer getNumeroFornada() {
		return numeroFornada;
	}

	public void setNumeroFornada(Integer numeroFornada) {
		this.numeroFornada = numeroFornada;
	}

	public Integer getQuantidadePizzas() {
		return quantidadePizzas;
	}

	public void setQuantidadePizzas(Integer quantidadePizzas) {
		this.quantidadePizzas = quantidadePizzas;
	}

}
