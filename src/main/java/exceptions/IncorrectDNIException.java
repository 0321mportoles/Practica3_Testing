package exceptions;
import model.Cliente;

public class IncorrectDNIException extends ClientException{
	
	public IncorrectDNIException(Cliente c) {
		super(c);
	}

	private static final long serialVersionUID = 1L;
	
	public String getMessage() {
		return "El dni " + this.cliente.getNumeroDniNie() + " del cliente con ID: " + this.cliente.getId() 
				+ " y nombre: " + this.cliente.getNombreCliente() 
				+ " no tiene el formato correcto";
	}
}
