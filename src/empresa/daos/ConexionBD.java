package empresa.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;
import com.mysql.cj.jdbc.Driver;

public class ConexionBD {
	private static final String NOMBRE_BD="curso";
	private static final String PROTOCOLO="jdbc:mysql:/";
	private static final String DOMINIO="/localhost:3306/";
	private static final String URL = PROTOCOLO+DOMINIO+NOMBRE_BD;
	private static final String USUARIO = "root";
	private static final String PASSWORD = "root";
	
	private static Connection conexion=null;
	
	private ConexionBD(){	
	    try{
	    	DriverManager.registerDriver(new Driver());
	    	conexion= DriverManager.getConnection(URL, USUARIO, PASSWORD);
	    }
	    catch(SQLException e){
	    	e.printStackTrace();
	    }
	}
	
	public static Connection getConexion() {
		return Optional.ofNullable(conexion).orElseGet(() -> { new ConexionBD();
															   return conexion; } );
	}
	
	public static void cerrarConexion() {
		Optional.ofNullable(conexion).ifPresent(con->{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
	}
}
