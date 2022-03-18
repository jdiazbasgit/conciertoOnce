package examen;

public class ClaseMain {

	public static void main(String[] args) {
		
		Operaciones operaciones = new Operaciones(33,66);
		operaciones.suma();
	

		System.out.println(operaciones.getResultado());

	}

}