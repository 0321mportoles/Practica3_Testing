package interfazDao;


import java.util.List;

import model.Cliente;

public interface InterfazClienteDao {
	
	public boolean crear(Cliente cliente);
	public List<Cliente> obtenerTodos();
	public Cliente obtener(int id);
	public void actualizar(Cliente cliente, String[] params);
	public void eliminar(Cliente cliente);
}
