package exceptions;
import model.Cliente;
import model.Pedido;

public class ClientNotFoundException extends PedidoException{
	
	public ClientNotFoundException(Pedido p) {
		super(p);
	}

	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "El cliente con codigoPedido: " + this.pedido.getCodigoPedido() 
				+ " no existe en la base de datos";
	}
}
