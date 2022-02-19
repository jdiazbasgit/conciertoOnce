package ventanas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HiloEscuchaRegistroServidor extends Thread {
	private Chat chat;
	private HashMap hashMap;
	//Codigo nuevo hashmap.
	public static <Usuarios> void main(String[] args) {
		
		Map<String,String>Usuarios=new HashMap<String,String>();
		//Usuarios.put("direccionIp","nickDeUsuario");
		Usuarios.put("Sergio", "192.168.10.26");
		Usuarios.put("Arkano", "192.168.10.40");
		Usuarios.put("Javi","192.168.10.64");
		Usuarios.put("Mar","192.168.10.68");
		Usuarios.put("Juan Carlos","192.168.10.30");
		Usuarios.put("Anna","192.168.10.101");
		Usuarios.put("Antonio","192.168.10.139");
		Usuarios.put("Sara","192.168.10.38");
		Usuarios.put("Pedro","192.168.10.124");
		Usuarios.put("Ricardo","192.168.10.52");
		Usuarios.forEach((Key,Value)->System.out.println(Key+ ":" +Value));
		
		//System.out.println(((Object) Usuarios).stream().sorted().map(e->e.getName()).filter(Key.Value).sum());
	}
	
	

	
	
	
	
	
	
	
	
	public HiloEscuchaRegistroServidor(Chat chat) {
		this.chat = chat;
	}

	@Override
	public void run() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5001);
			while (true) {
				Socket socketDeRecepcion = serverSocket.accept();
				String direccionIp = socketDeRecepcion.getInetAddress().getHostAddress();
				InputStreamReader inputStreamReader = new InputStreamReader(socketDeRecepcion.getInputStream());
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				String nickDeUsuario = bufferedReader.readLine();

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
