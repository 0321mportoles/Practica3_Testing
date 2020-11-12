package dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import connection.Conexion;
import interfazDao.*;
import model.Cliente;

public class ClienteDaoImplementacion implements InterfazClienteDao{

	private static List <Cliente> clientes = new ArrayList<>();
	
	
//	public ClienteDaoImplementacion(List<Cliente> clientes) {
//		super();
//		this.clientes = clientes;
//	}

	@Override
	public boolean crear(Cliente cliente) {
		clientes.add(cliente);
		
		return true;
	}


	@Override
	public Cliente obtener(int id) {
		for (Cliente cliente : clientes) {
			if(cliente.getId() == id) {
				return cliente;
			}
		}
		
		return null;
	}

	@Override
	public List<Cliente> obtenerTodos() {
		return clientes;
	}

	@Override
	public void actualizar(Cliente cliente, String[] params) {
		cliente.setNombreCliente(Objects.requireNonNull(params[0], "Nombre cannot be null"));
		cliente.setApellidoContacto(Objects.requireNonNull(params[1], "Apellido cannot be null"));
		    
		clientes.add(cliente);
	}

	@Override
	public void eliminar(Cliente cliente) {
		clientes.remove(cliente);
	}


	public boolean tienePosibleDuplicado(Cliente cliente) {
		for (Cliente c : clientes) {
			if (
					cliente.getNombreCliente() != null && cliente.getNombreCliente().equals(c.getNombreCliente())  
				|| (cliente.getApellidoContacto() != null && cliente.getApellidoContacto().equals(c.getApellidoContacto()))
				|| cliente.getTelefono() != 0 && c.getTelefono() != 0 && cliente.getTelefono() == c.getTelefono()
			) {
				return true;
			}
		}
		
		return false;
	}
	
			
	
}

