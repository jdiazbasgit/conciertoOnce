package empresa.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DatosPersonales {
	private int id;
	private EstadoCivil estadoCivil;
	private Hijo hijo;
}
