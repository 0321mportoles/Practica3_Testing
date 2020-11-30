package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import interfazDao.InterfazClienteDao;
import interfazDao.InterfazPedidoDao;
import model.Cliente;
import model.Pedido;

public class PedidoDaoImplementacion implements InterfazPedidoDao {
	private List<Pedido> pedidos = new ArrayList<>();
	
	//public PedidoDaoImplementacion(List<Pedido> pedidos) {
	//	super();
	//	this.pedidos = pedidos;
	//}
	
	@Override
	public boolean crear(Pedido pedido) {
		pedidos.add(pedido);
		return true;
	}

	@Override
	public Pedido obtener(int codigoPedido) {
		for (Pedido pedido : pedidos) {
			if(pedido.getCodigoPedido() == codigoPedido) {
				return pedido;
			}
		}
		
		return null;
	}
	
	@Override
	public List<Pedido> obtenerTodos() {
		return pedidos;
	}

	@Override
	public void actualizar(Pedido pedido/*, String [] params*/) {
		Pedido pedidoAActualizar = this.obtener(pedido.getCodigoPedido());
		/* TODO:: Aceptar parametros que cambien datos del pedido */
		pedidoAActualizar.setCodigoCliente(3);
//		pedidoAActualizar.setFechaPedido(Objects.requireNonNull(params[1], "FechaPedido cannot be null"));
//		pedidoAActualizar.setFechaEntrega(Objects.requireNonNull(params[2], "FechaEntrega cannot be null"));
//		pedidoAActualizar.setCodigoCliente(Objects.requireNonNull(params[3], "CodigoCliente cannot be null"));  
		
//		pedidos.add(pedido);
	}

	@Override
	public void eliminar(Pedido pedido) {
		pedidos.remove(pedido);
	}

}
