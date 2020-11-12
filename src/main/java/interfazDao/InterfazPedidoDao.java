package interfazDao;

import java.util.List;

import model.Pedido;

public interface InterfazPedidoDao {
	public boolean crear(Pedido pedido);
	public Pedido obtener(int codigoPedido);
	public void actualizar(Pedido pedido/*, String [] params*/);
	public void eliminar(Pedido pedido);
	public List<Pedido> obtenerTodos();
}
