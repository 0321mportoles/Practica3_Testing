package constructor;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.ClienteDaoImplementacion;
import exceptions.ClientException;
import exceptions.DuplicateException;
import exceptions.IncorrectDNIException;
import exceptions.IncorrectEmailException;
import exceptions.IncorrectNIEException;
import exceptions.PossibleDuplicateClientException;
import model.Cliente;
import model.Cliente.Documento;

public class ClienteBuilder  {
		int id;
		String nombreCliente; 
		String apellidoContacto; 
		long telefono;
		Documento tipoDocumento;
		String numeroDniNie;
		String email;
		String password;
		
		public ClienteBuilder (int id) {
			this.id = id;
		}
		
		public ClienteBuilder withNombreCliente(String nombreCliente) {
			this.nombreCliente = nombreCliente;
			return this;
		}
		
		public ClienteBuilder withApellidoContacto(String apellidoContacto) {
			this.apellidoContacto = apellidoContacto;
			return this;
		}
		
		public ClienteBuilder withTelefono(long telefono) {
			this.telefono = telefono;
			return this;
		}
		
		public ClienteBuilder withTipoDocumento(Documento tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
			return this;
		}
		
		public ClienteBuilder withNumeroDniNie(String numeroDniNie) {
			this.numeroDniNie = numeroDniNie;
			return this;
		}
		
		public ClienteBuilder withEmail(String email) {
			this.email = email;
			return this;
		}
		
		public ClienteBuilder withPassword(String password) {
			this.password = password;
			return this;
		}

		public Cliente build() throws ClientException {
			Cliente cliente = new Cliente();
			cliente.setId(this.id);
			cliente.setNombreCliente(this.nombreCliente);
			cliente.setApellidoContacto(this.apellidoContacto);
			cliente.setTelefono(this.telefono);
			cliente.setTipoDocumento(this.tipoDocumento);
			cliente.setNumeroDniNie(this.numeroDniNie);
			cliente.setEmail(this.email);
			cliente.setPassword(this.password);
			
			
			comprobarDatosCliente(cliente);
			return cliente;
		}

		@SuppressWarnings("static-access")
		private void comprobarDatosCliente(Cliente cliente) throws ClientException {
			ClienteDaoImplementacion clienteDao = new ClienteDaoImplementacion();
			
			if (!(clienteDao.obtener(id) == null)) {
				throw new DuplicateException(cliente);
			}
						
			// System.out.println("El cliente con Id: " + id + " Nombre: " + nombreCliente + " ha sido creado correctamente");
			
			if ((clienteDao.tienePosibleDuplicado(cliente))) {
				throw new PossibleDuplicateClientException(cliente);
			}
			
			if (tipoDocumento == tipoDocumento.DNI ) {
				if (!validarDNI(numeroDniNie)) {
					throw new IncorrectDNIException(cliente);
				}
				
			}
			
			if (tipoDocumento == tipoDocumento.NIE ) {
				if (!validarNIE(numeroDniNie)) {
					throw new IncorrectNIEException(cliente);
				}
			}
				
			if (cliente.getEmail() != null) {
				if (!validarEmail(cliente.getEmail())) {
					throw new IncorrectEmailException(cliente);
				}
			}
			
		}

		private boolean validarEmail(String email) {
	        if (email != null) {
	        	Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        
	        	Matcher matcher = pattern.matcher(email);

	        	return matcher.find();
	        }
	        
	        return false;
			
		}

		private boolean validarNIE(String numeroDniNie) {
			boolean letraPrimera = Character.isLetter(this.numeroDniNie.charAt(0));
			boolean letraUltima = Character.isLetter(this.numeroDniNie.charAt(8));
			
			if (letraPrimera && letraUltima && numeroDniNie.length() == 9) {
				return true;
			} 
			
			return false;
		}

		private boolean validarDNI(String numeroDniNie) {
		
			
			if (numeroDniNie.length() != 9 || Character.isLetter(this.numeroDniNie.charAt(8)) == false) {
				return false;
			} 
			
			return true;
			
		}
}
		


