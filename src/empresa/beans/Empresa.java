package empresa.beans;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Setter
@Getter
@AllArgsConstructor
@ToString
@Complement
public class Empresa implements Serializable {
	
	private final int id;
	private String nombre;
	private String cif;

}

