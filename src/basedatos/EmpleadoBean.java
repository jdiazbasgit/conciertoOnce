package basedatos;
import lombok.Data;

@Data

public class EmpleadoBean {
	private int id_Cargos;
	private String descripcion_Cargos;
	private int id_EstadoCivil;
	private String descripcion_EstadoCivil;
	private String id_DatosLaborales;
	private int salario_DatosLaborales;
	private int cargosId_DatosLaborales;
}
