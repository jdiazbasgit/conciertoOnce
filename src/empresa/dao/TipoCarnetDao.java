package empresa.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import empresa.beans.TipoCarnet;

public class TipoCarnetDao extends EmpresaDao {
private TipoCarnet tipoCarnet;

public TipoCarnetDao(TipoCarnet tipoCarnet) {
	super();
	this.tipoCarnet=tipoCarnet;
	
}
public List<TipoCarnet>dameTipoCarnet(){
	List<TipoCarnet> tipoCarnet=new ArrayList<TipoCarnet>();
	try {
		Connection conexion = dameConexion();
		
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			return tipoCarnet;
		}
	}


}
