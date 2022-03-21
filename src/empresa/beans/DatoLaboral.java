package empresa.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DatoLaboral {
	private int id;
	private int salario;
	private Cargo cargo;
}
