package examenJuan;

public class Ejecución {

	public static void main(String[] args) {
		System.out.println("Resultado Suma = " + new Operaciones(5, 2).suma());
		System.out.println("Resultado Resta = " + new Operaciones().resta(6, 2));
		System.out.println("Resultado Multiplicación = " + new Operaciones(3, 5).multi());
		System.out.println("Resultado División = " + new Operaciones(26, 7).division() + "\n");

		Operaciones operaSuma = new Operaciones(5, 40);
		System.out.println("El resultado de sumar " + operaSuma.getNumero1() + " y " + operaSuma.getNumero2()
				+ " es igual a " + operaSuma.suma());

		Operaciones operaResta = new Operaciones(12, 3);
		System.out.println("El resultado de restar " + operaResta.getNumero1() + " y " + operaResta.getNumero2()
				+ " es igual a " + operaResta.otraResta());

		Operaciones operaMulti = new Operaciones(6, 4);
		System.out.println("El resultado de multiplicar " + operaMulti.getNumero1() + " y " + operaMulti.getNumero2()
				+ " es igual a " + operaMulti.otraMulti(operaMulti.getNumero1(), operaMulti.getNumero2()));

		Operaciones operaDiv = new Operaciones(6, 4);
		System.out.println("El resultado de dividir " + operaDiv.getNumero1() + " y " + operaDiv.getNumero2()
				+ " es igual a " + operaDiv.otraDivision(operaDiv.getNumero1(), operaDiv.getNumero2()));
	}
}
