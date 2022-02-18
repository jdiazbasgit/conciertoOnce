package ventanas.trabajo;

import ventanas.hilos.envio.HiloCliente;

public class Cliente {

	public static void main(String[] args) {
		HiloCliente cliente= new HiloCliente();
		cliente.start();

	}

}
