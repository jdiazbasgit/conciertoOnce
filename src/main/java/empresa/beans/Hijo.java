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
public class Hijo implements Serializable{

	private int id;
	private int numChicos;
	private int numChicas;
	

}
