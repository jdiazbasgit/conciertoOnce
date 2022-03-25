package once.curso.practicarest.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
@SuppressWarnings("serial")
public class Empresa implements Serializable {
	
	
	private int id;
	private String nombre;
	private String cif;

}
