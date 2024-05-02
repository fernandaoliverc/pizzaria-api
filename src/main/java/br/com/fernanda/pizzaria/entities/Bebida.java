package br.com.fernanda.pizzaria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bebida")
public class Bebida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBebida;

	@Column(length = 50)
	private String nome;

	@Column(precision = 10)
	private Double preco;

	public Bebida(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Bebida() {

	}

	public Long getIdBebida() {
		return idBebida;
	}

	public void setIdBebida(Long idBebida) {
		this.idBebida = idBebida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
