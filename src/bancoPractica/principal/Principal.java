package bancoPractica.principal;

import java.util.Scanner;

import bancoPractica.cuentas.Cuenta;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		
		
		
		double totalCuenta;
		Cuenta cuenta1;
		cuenta1 = new Cuenta(1111111,2500.70);
		double ingreso;
		
		while(!salir) {
			System.out.println("");
			System.out.println("1. Mostrar saldo");
			System.out.println("2. Ingresar dinero");
			System.out.println("3. Retirar dinero");
			System.out.println("4. Mostrar informacion");
			System.out.println("5. Salir");
			System.out.println("Escribe una de las opciones:");
			int opcion = teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("");
				System.out.println("Mostrar saldo");
				totalCuenta = cuenta1.saldo();
				System.out.println("Total actual en la cuenta "+totalCuenta+"€");
				break;
			case 2:
				System.out.println("");
				System.out.println("Ingresar dinero en la cuenta");
				System.out.println("Indique la cantidad de dinero que desea ingresar");
				ingreso = teclado.nextDouble();
				System.out.println("Se ingresan en la cuenta: "+ingreso+"€ ");
				cuenta1.depositar(ingreso);
				break;
			case 3:
				System.out.println("");
				System.out.println("Retirar dinero en la cuenta");
				System.out.println("Indique la cantidad de dinero que desea retirar");
				ingreso = teclado.nextDouble();
				System.out.println("Se retira de la cuenta: "+ingreso+"€");
				cuenta1.retirar(ingreso);
				break;
			case 4:
				System.out.println("");
				System.out.println("Informacion de la cuenta");
				//cuenta1.mostrar();
				System.out.println(cuenta1);
				break;	
			case 5:
				System.out.println("Has salido fuera...");
				salir=true;
				break;
			default:
				System.out.println("Solo numeros entre el 1 y 4");
				
			}	
		}
	}
}
