package examenJuan;

public class Ejecución {

	public static void main(String[] args) {
		System.out.println(new Operaciones(5, 2).suma());
		System.out.println(new Operaciones().resta(6, 2));
		System.out.println(new Operaciones(99, 3).division());
		System.out.println(new Operaciones(3, 5).multi());

		Operaciones operaciones = new Operaciones(5, 40);
		System.out.println("El resultado de sumar " + operaciones.getNumero1() + " y " + operaciones.getNumero2()
				+ " es igual a " + operaciones.suma());

		Operaciones operaciones2 = new Operaciones(12, 3);
		System.out.println("El resultado de restar " + operaciones2.getNumero1() + " y " + operaciones2.getNumero2()
				+ " es igual a " + operaciones2.otraResta());

	}
}
