package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	 
public class Conexion {
	
	public static Connection conectar() {
		Connection con = null;
			
		String password = "Jardineria20";
		String usuario = "jardineria";
		String url = "jdbc:mysql://localhost:3306/jardineria?user=" + usuario
				+ "&password=" + password;
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}// fin Connection

} //fin del class
