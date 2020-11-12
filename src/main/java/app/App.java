package app;

import java.time.LocalDate;

import constructor.ClienteBuilder;
import constructor.PedidoBuilder;
import dao.ClienteDaoImplementacion;
import dao.PedidoDaoImplementacion;
import exceptions.ClientException;
import exceptions.DuplicateException;
import exceptions.PossibleDuplicateClientException;
import model.Cliente;
import model.Pedido;
import model.Cliente.Documento;

public class App {

	public static void main(String[] args) throws ClientException {

		ClienteDaoImplementacion cDao = new ClienteDaoImplementacion();
		try {
			cDao.crear(new ClienteBuilder(1)
									.withNombreCliente("Marta")
									.withTipoDocumento(Documento.DNI)
									.withNumeroDniNie("72997211W")
									.withEmail("marta@marta.es")
									.build());
			
			cDao.crear(new ClienteBuilder(2)
									.withNombreCliente("Maria")
									.withTipoDocumento(Documento.DNI)
									.withNumeroDniNie("72997211P")
									.withEmail("marta@marta1.es")
									.build());
		} 
		catch (DuplicateException e) {
			System.out.println(e.getMessage());
			 
		} catch (PossibleDuplicateClientException e) {
			System.out.println(e.getMessage());
		}
		
		/* Imprimir todos los clientes */
		System.out.println("******** Clientes creados ********");
		for (Cliente c : cDao.obtenerTodos()) {
			System.out.println(c);
		}
		
		PedidoDaoImplementacion pDao = new PedidoDaoImplementacion();
		
		try {
			pDao.crear(new PedidoBuilder(1)
							.withFechaPedido(LocalDate.of(2020, 11, 13))
							.withFechaEntrega(LocalDate.of(2020, 11, 20))
							.withCodigoCliente(1)
							.build());
			
			pDao.crear(new PedidoBuilder(2)
					.withFechaPedido(LocalDate.of(2020, 11, 13))
					.withFechaEntrega(LocalDate.of(2020, 11, 24))
					.withCodigoCliente(2)
					.build());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		
				
		/* Imprimir todos los pedidos*/
		System.out.println("******** Pedido creados ********");
		for (Pedido p : pDao.obtenerTodos()) {
			System.out.println(p);
		}
	}

}
