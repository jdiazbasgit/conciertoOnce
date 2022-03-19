package trabajos;

import examenes.Operaciones;

public class trabajo {

	public static void main(String[] args) {
		
		Operaciones operaciones = new Operaciones(8, 8);
		System.out.println(operaciones.sumaNumeros(operaciones.getNumero1(), operaciones.getNumero2()));

	}

}
