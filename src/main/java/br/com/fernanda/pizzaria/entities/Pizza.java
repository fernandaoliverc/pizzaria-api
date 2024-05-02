package br.com.fernanda.pizzaria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pizza")
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPizza;

	@Column(length = 50)
	private String nome;

	@Column
	private Double precoBase;

	@Column
	private Boolean personalizada;

	public Pizza(String nome, Double precoBase, Boolean personalizada) {
		this.nome = nome;
		this.precoBase = precoBase;
		this.personalizada = personalizada;
	}

	public Pizza() {

	}

	public Long getIdPizza() {
		return idPizza;
	}

	public void setIdPizza(Long idPizza) {
		this.idPizza = idPizza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(Double precoBase) {
		this.precoBase = precoBase;
	}

	public Boolean getPersonalizada() {
		return personalizada;
	}

	public void setPersonalizada(Boolean personalizada) {
		this.personalizada = personalizada;
	}

}
