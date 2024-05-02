package br.com.fernanda.pizzaria.entities;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;

	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false)
	private Cliente cliente;

	@Column
	private Long idFornada;

	@Column
	private Timestamp dataPedido;

	public Pedido(Cliente cliente, Long idFornada, Timestamp dataPedido) {
		this.cliente = cliente;
		this.idFornada = idFornada;
		this.dataPedido = dataPedido;
	}

	public Pedido() {

	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getIdFornada() {
		return idFornada;
	}

	public void setIdFornada(Long idFornada) {
		this.idFornada = idFornada;
	}

	public Timestamp getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Timestamp dataPedido) {
		this.dataPedido = dataPedido;
	}

}
