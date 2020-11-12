package exceptions;
import model.Cliente;
import model.Pedido;

public class DuplicateException2 extends PedidoException{
	
	public DuplicateException2(Pedido p) {
		super(p);
	}

	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "El pedido con codigo: " + this.pedido.getCodigoPedido() 
				+ " que intentas crear ya existe";
	}
}
