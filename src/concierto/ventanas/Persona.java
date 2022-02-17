package concierto.ventanas;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@Setter
@Getter
@ToString
@NoArgsConstructor (force = true)
@AllArgsConstructor

public class Persona implements Serializable {
	
	private String nick;
	private String password;
	private String direccion_ip;

}
