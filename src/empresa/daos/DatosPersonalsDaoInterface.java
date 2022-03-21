package empresa.daos;

import java.sql.SQLException;
import java.util.List;

import empresa.beans.DatosPersonales;

public interface DatosPersonalsDaoInterface {

	public List<DatosPersonales> dameDatosPersonales() throws SQLException ;
}
