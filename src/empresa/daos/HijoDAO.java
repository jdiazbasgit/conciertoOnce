package empresa.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import empresa.beans.Hijo;

public class HijoDAO extends ConexionDAO {
	
	public String[] getColumnasHijo() {
		return new String[] {"ID","NUMERO CHICOS","NUMERO CHICAS"};
	}
	
	public  List<Hijo> dameListaHijos() throws SQLException{
		List<Hijo> listaHijos = new ArrayList<>();
		
		try ( Connection conn = getConexion();
			  Statement instruccion = conn.createStatement()) {	
			
			String query = "SELECT h.ID,h.NUMERO_CHICOS,h.NUMERO_CHICAS FROM hijos as h";
			ResultSet rs = instruccion.executeQuery(query);
			
			while(rs.next()) {
				Hijo hijo = new Hijo(rs.getInt(1), rs.getInt(2), rs.getInt(3));
				listaHijos.add(hijo);
			}
			
		}
		
		return listaHijos;			
	}
	
	public  String[][] dameArrayHijos() throws SQLException{
		List<Hijo> listaHijos = this.dameListaHijos();	
		String[][] arrayStringHijos = new String[listaHijos.size()][this.getColumnasHijo().length];
		int numeroFila=0;
		for (Hijo hijo:listaHijos) {
			arrayStringHijos[numeroFila][0]=String.valueOf(hijo.getId());
			arrayStringHijos[numeroFila][1]=String.valueOf(hijo.getNumChicos());
			arrayStringHijos[numeroFila][2]=String.valueOf(hijo.getNumChicas());
			numeroFila++;
		}
		return arrayStringHijos;
	}
	
	public void grabaHijos(Hijo hijo) throws SQLException {
		
		String query = "INSERT INTO hijos (NUMERO_CHICOS,NUMERO_CHICAS) values(?,?) ";
		
		try  ( Connection conn = getConexion();
			   PreparedStatement preparedStatement = conn.prepareStatement(query)) { 
						
			preparedStatement.setInt(1, hijo.getNumChicos());
			preparedStatement.setInt(2, hijo.getNumChicas());
	    
			preparedStatement.execute();
			
		}
		
	}
	





}
