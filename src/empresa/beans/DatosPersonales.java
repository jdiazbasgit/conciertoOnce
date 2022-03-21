package empresa.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data

public class DatosPersonales {
private int id;
private EstadoCivil estadoCivil;
private Hijo hijo;
}
