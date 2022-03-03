package beans;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Hijo implements Serializable{
	private static final long serialVersionUID = 1L;
	private final int id;
	private int numChicos;
	private int numChicas;
	
	
}
