package streams.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Optional;

import streams.output.Persona;

public class LeerObjeto {

	public static void main(String[] args) {

		try (FileInputStream fileInputStream = new FileInputStream("pepe.agenda");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			Persona persona = null;
			if (objectInputStream != null)
				persona = (Persona) objectInputStream.readObject();
			Optional<Persona> optional = Optional.ofNullable(persona);
			System.out.println(optional.or(()->Optional.of(new Persona("luis","534543",55))).get().toString());
			//optional.ifPresent(p->System.out.println(p.toString()));
				

		} catch (FileNotFoundException e) {
			System.out.println("el fichero no existe");
		} catch (IOException e) {
			System.out.println("no hay comunicacion");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("esta clase no existe");
		} catch (ClassCastException e) {
			System.out.println("esto no es la clase que quieres");
		}

	}

}
