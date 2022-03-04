package empresa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import empresa.beans.TipoCarnet;

public class TipoCarnetDao extends EmpresaDao {
private TipoCarnet tipoCarnet;

public TipoCarnetDao(TipoCarnet tipoCarnet) {
	super();
	this.tipoCarnet=tipoCarnet;
	
}
@SuppressWarnings("finally")
public List<TipoCarnet>dameTipoCarnet(){
	List<TipoCarnet> tipoCarnet=new ArrayList<TipoCarnet>();
	try {
		Connection conexion = dameConexion();
		  Statement instruccion= conexion.createStatement();
			ResultSet resultSet= instruccion.executeQuery("SELECT ID,DEFINICION");
			while(resultSet.next()) {
			
			}
		
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			return tipoCarnet;
		}
	}


}
