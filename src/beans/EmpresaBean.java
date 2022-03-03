package beans;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class EmpresaBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private final int id;
	private String nombre;
	private String cif;
}

