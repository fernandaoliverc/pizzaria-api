package br.com.fernanda.pizzaria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pizza_pedida")
public class PizzaPedida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPizzaPedida;

	@ManyToOne
	@JoinColumn(name = "id_pedido", nullable = false)
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name = "id_pizza", nullable = false)
	private Pizza pizza;

	@ManyToOne
	@JoinColumn(name = "id_tamanho", nullable = false)
	private Tamanho tamanho;

	@Column(nullable = false)
	private Integer quantidade;

	public PizzaPedida(Pedido pedido, Pizza pizza, Tamanho tamanho, Integer quantidade) {
		this.pedido = pedido;
		this.pizza = pizza;
		this.tamanho = tamanho;
		this.quantidade = quantidade;
	}

	public PizzaPedida() {

	}

	public Long getIdPizzaPedida() {
		return idPizzaPedida;
	}

	public void setIdPizzaPedida(Long idPizzaPedida) {
		this.idPizzaPedida = idPizzaPedida;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
