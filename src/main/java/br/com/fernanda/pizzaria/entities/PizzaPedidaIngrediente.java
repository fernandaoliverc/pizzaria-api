package br.com.fernanda.pizzaria.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pizza_pedida_ingrediente")
public class PizzaPedidaIngrediente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPizzaPedida;

	@ManyToOne
	@JoinColumn(name = "id_ingrediente")
	private Ingrediente ingrediente;

	public PizzaPedidaIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public PizzaPedidaIngrediente() {

	}

	public Long getIdPizzaPedida() {
		return idPizzaPedida;
	}

	public void setIdPizzaPedida(Long idPizzaPedida) {
		this.idPizzaPedida = idPizzaPedida;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

}
