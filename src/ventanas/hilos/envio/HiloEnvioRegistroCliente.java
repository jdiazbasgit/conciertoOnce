package ventanas.hilos.envio;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import lombok.Data;
import ventanas.Chat;
import ventanas.hilos.envio.HiloCliente;
@Data
public class HiloEnvioRegistroCliente extends HiloEnvio {
	// variables estaticas puertos
	// PUERTO 5002

	public HiloEnvioRegistroCliente(Chat chat, int puerto) {
		super(chat, puerto);
		// TODO Auto-generated constructor stub
	}
	private Chat chat;
	private int puerto;

	private String ip;
	

	
	
//	Chat chat = new Chat(Chat.IP_SERVIDOR, Chat.PUERTO_ESCUCHA_REGISTRO_SERVIDOR) {
//	this.ip = IP_SERVIDOR;
//	this.puerto = PUERTO_ESCUCHA_REGISTRO_SERVIDOR;
//	}
//	public HiloEnvioRegistroCliente() {
//		super();
//		// TODO Auto-generated constructor stub
//	}


	@Override
	public void run() {
		System.out.println("Entramos en el hilo de registro");
		System.out.println("texto de jtextfield: " + chat.getTNick().getText());
		Socket socket = null;
		try {
			socket = new Socket("192.168.10.69", 5000);
			
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			printWriter.println(getChat());
			
			
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
@Override
public void hacerAlgo(Socket socket) throws IOException {
	// TODO Auto-generated method stub
	
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


