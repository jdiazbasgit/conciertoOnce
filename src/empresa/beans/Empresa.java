package empresa.beans;


import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Setter

@Getter
@AllArgsConstructor
@ToString
public class Empresa implements Serializable {
	
	private final int id;
	private String nombre;
	private String cif;

}

