package streams.output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class EscribitObjeto {
	
	
	public static void main(String[] args) {
		 Persona persona=new Persona("pepe", "9123456787", 25);
		try(
				FileOutputStream fileOutputStream= new FileOutputStream("pepe.agenda");
				ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
				) {
			
			objectOutputStream.writeObject(persona);
			objectOutputStream.flush();
		} catch (Exception e) {
			
		}
		
	}

}
