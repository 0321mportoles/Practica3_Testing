package model;

import java.time.LocalDate;

public class Pedido {
	
	private int codigoPedido;
	private LocalDate fechaPedido;
	private LocalDate fechaEsperada;
	private LocalDate fechaEntrega;
	private String estado; 
	private String comentarios; 
	private int codigoCliente;
	
	public Pedido(int codigoPedido, LocalDate fechaPedido, LocalDate fechaEsperada, LocalDate fechaEntrega,
			String estado, String comentarios, int codigoCliente) {
		super();
		this.codigoPedido = codigoPedido;
		this.fechaPedido = fechaPedido;
		this.fechaEsperada = fechaEsperada;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		this.comentarios = comentarios;
		this.codigoCliente = codigoCliente;
	}

	public Pedido(int codigoPedido, LocalDate fechaPedido, LocalDate fechaEntrega, int codigoCliente) {
		super();
		this.codigoPedido = codigoPedido;
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEntrega;
		this.codigoCliente = codigoCliente;
	}
	
	public Pedido() {
	
	}

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public LocalDate getFechaEsperada() {
		return fechaEsperada;
	}

	public void setFechaEsperada(LocalDate fechaEsperada) {
		this.fechaEsperada = fechaEsperada;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	@Override
	public String toString() {
		return "Pedido:: ID: " + this.codigoPedido + " Codigo de cliente: " + this.codigoCliente;
	}	 
}
