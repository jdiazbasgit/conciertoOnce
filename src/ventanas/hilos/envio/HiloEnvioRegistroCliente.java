package ventanas.hilos.envio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import ventanas.Chat;

public class HiloEnvioRegistroCliente extends Thread {
	// variables estaticas puertos
	// PUERTO 5002

	Chat chat = new Chat();

	@Override
	public void run() {
		System.out.println("Entramos en el hilo de registro");
		System.out.println("texto de jtextfield: " + chat.getTNick().getText());
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 5000);
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			objectOutputStream.writeBytes(chat.getTNick().getText());
			objectOutputStream.flush();
			
			//System.out.println(chat.getTNick().getText() + "Esto es del hilo de registro");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


//getBRegistrar().addActionListener(new ActionListener() {
//
//	public void actionPerformed(ActionEvent e) {
//		if (getTNick().getText() == "") {
//			System.out.println("Introduce algo...");
//		}
//		HiloEnvioRegistroCliente registro = new HiloEnvioRegistroCliente();
//		registro.start();
//		//System.out.println("Has pulsado el boton");
//		//System.out.println(getTNick().getText() + " ha sido registrado");
//		
//	}
//});


//Persona persona=new Persona("pepe", "9123456787", 25);
//try(
//		FileOutputStream fileOutputStream= new FileOutputStream("pepe.agenda");
//		ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
//		) {
//	
//	objectOutputStream.writeObject(persona);
//	objectOutputStream.flush();
//} catch (Exception e) {
//	
//}


