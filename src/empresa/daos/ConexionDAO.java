package empresa.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class ConexionDAO {
	private static final String NOMBRE_BD="curso";
	private static final String PROTOCOLO="jdbc:mysql:/";
	private static final String DOMINIO="/localhost:3306/";
	private static final String URL = PROTOCOLO+DOMINIO+NOMBRE_BD;
	private static final String USUARIO = "root";
	private static final String PASSWORD = "1234";
	


	
	public  Connection getConexion() throws SQLException{
		DriverManager.registerDriver(new Driver());
    	return DriverManager.getConnection(URL, USUARIO, PASSWORD);		
	}
	

}
