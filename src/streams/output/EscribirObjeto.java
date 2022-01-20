package streams.output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EscribirObjeto {

	public static void main(String[] args) {

		Persona persona = new Persona("pepe", "9438274938", 25);

		try (FileOutputStream fileOutputStream = new FileOutputStream("pepe.agenda");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

			objectOutputStream.writeObject(persona);
			objectOutputStream.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
