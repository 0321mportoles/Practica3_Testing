package exceptions;
import model.Cliente;
import model.Pedido;

public class WrongOrderDayCrationException extends PedidoException{
	
	public WrongOrderDayCrationException(Pedido p) {
		super(p);
	}

	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "El pedido con codigoPedido: " + this.pedido.getCodigoPedido() 
				+ " no puede ser creado en otra fecha que no sea hoy";
	}
}
