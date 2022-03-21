package empresa.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Vehiculo {
	
	private int id;
	private String marca;
	private String modelo;

}
