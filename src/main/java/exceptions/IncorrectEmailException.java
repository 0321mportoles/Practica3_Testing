package exceptions;
import model.Cliente;

public class IncorrectEmailException extends ClientException {
	
	public IncorrectEmailException(Cliente c) {
		super(c);
	}

	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "El email " + this.cliente.getEmail() + " del cliente con ID: " + this.cliente.getId() 
				+ " y nombre: " + this.cliente.getNombreCliente() 
				+ " no tiene el formato correcto";
	}
}
