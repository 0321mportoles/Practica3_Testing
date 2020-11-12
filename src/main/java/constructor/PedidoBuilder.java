package constructor;

import java.time.LocalDate;

import dao.ClienteDaoImplementacion;
import dao.PedidoDaoImplementacion;
import exceptions.ClientNotFoundException;
import exceptions.DateAndClientIncorrectException;
import exceptions.DuplicateException2;
import exceptions.PedidoException;
import exceptions.WrongOrderDayCrationException;
import model.Pedido;

public class PedidoBuilder {
		int codigoPedido;
		LocalDate fechaPedido;
		LocalDate fechaEntrega;
		int codigoCliente;
		
		public PedidoBuilder (int codigoPedido) {
			this.codigoPedido = codigoPedido;
		}
	
		public PedidoBuilder withFechaPedido(LocalDate fechaPedido) {
			this.fechaPedido = fechaPedido;
			return this;
		}
		
		public PedidoBuilder withFechaEntrega(LocalDate fechaEntrega) {
			this.fechaEntrega = fechaEntrega;
			return this;
		}
		
		public PedidoBuilder withCodigoCliente(int codigoCliente) {
			this.codigoCliente = codigoCliente;
			return this;
		}
		
		public Pedido build() throws Exception {
			Pedido pedido = new Pedido();
			pedido.setCodigoPedido(this.codigoPedido);
			pedido.setFechaPedido(this.fechaPedido);
			pedido.setFechaEntrega(this.fechaEntrega);
			pedido.setCodigoCliente(this.codigoCliente);
			
			comprobarDatosPedido(pedido);
			return pedido;
		}
		private void comprobarDatosPedido(Pedido pedido) throws PedidoException {
			
			PedidoDaoImplementacion pedidoDao = new PedidoDaoImplementacion();
			
			if (!(pedidoDao.obtener(codigoPedido) == null)) {
				throw new DuplicateException2(pedido);
			}
			
			ClienteDaoImplementacion clienteDao = new ClienteDaoImplementacion();
	
			if(!(fechaPedido.equals(LocalDate.now()))) {
				throw new WrongOrderDayCrationException(pedido);
			}
			
			
			if (!fechaEntrega.isAfter(fechaPedido.plusDays(3)) && (clienteDao.obtener(codigoCliente) == null) ) {
				throw new DateAndClientIncorrectException(pedido);
			}
			
			if (clienteDao.obtener(codigoCliente) == null) {
				throw new ClientNotFoundException(pedido);
			}
			
//			System.out.println("El pedido con id: " + codigoPedido + " ha sido creado");		
		}
		
	
}

