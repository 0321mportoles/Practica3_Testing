package exceptions;

import model.Pedido;

public class PedidoException extends Exception{
	Pedido pedido;
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public PedidoException(Pedido p) {
		super();
		this.pedido = p;
	}

	public Pedido getPedido() {
		return pedido;
	}

}

