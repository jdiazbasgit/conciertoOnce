package ventanas.trabajo;

import ventanas.hilos.recepcion.HiloEscucha;
import ventanas.hilos.recepcion.HiloEscuchaMensajeCliente;
import ventanas.hilos.recepcion.HiloEscuchaRegistroCliente;

public class VerChat {
	public static void main(String[] args) {

		Chat chat = new Chat();
		chat.setSize(1200, 800);
		HiloEscucha escucha = new HiloEscuchaRegistroCliente(chat, Chat.PUERTO_ESCUCHA_REGISTRO_CLIENTE);
		escucha.start();
		HiloEscucha escuchaCliente= new HiloEscuchaMensajeCliente(chat, Chat.PUERTO_ESCUCHA_MENSAJES_CLIENTE);
		escuchaCliente.start();
		chat.setVisible(true);

	}
	
}
