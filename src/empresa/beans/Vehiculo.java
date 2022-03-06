package empresa.beans;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Vehiculo implements Serializable{
	private static final long serialVersionUID = -6701992778985767170L;
	
	private int id;
	private String marca;
	private String modelo;
	private int tipoCarnet;
}
