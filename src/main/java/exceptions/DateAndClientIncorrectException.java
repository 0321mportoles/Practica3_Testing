package exceptions;
import model.Cliente;
import model.Pedido;

public class DateAndClientIncorrectException extends PedidoException{
	
	public DateAndClientIncorrectException(Pedido p) {
		super(p);
	}

	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "El pedido con codigo: " + this.pedido.getCodigoPedido() 
				+ " con fecha de entrega: " + this.pedido.getFechaEntrega() 
				+ " y cliente con codigo: " + this.pedido.getCodigoCliente()
				+ "es incorrecto";
	}
}
