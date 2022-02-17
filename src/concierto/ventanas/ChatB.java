package concierto.ventanas;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//import javax.swing.JFrame;
import lombok.Getter;
import lombok.Setter;
import javax.swing.SwingUtilities; 






 
@Setter
@Getter
@SuppressWarnings("serial")
public class ChatB extends JFrame {
	private JPanel pGlobal, pSuperior, pInferior, pCentral, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private JLabel lNick, lUsuarios, lMensaje;
	private JButton bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	//private TextArea taUsuarios, taMensajes;
	private TextArea taMensajes;
	private JTextArea taUsuarios;
	private Color color;

	public ChatB() {
		
		List<Persona> listaUsuarios = new ArrayList<Persona>();
		listaUsuarios = cargaUsiarios();
	 
		System.out.println(listaUsuarios.size());
	
		setContentPane(new JPanel());
		setPSuperior(new JPanel());
		setPInferior(new JPanel());
		setPCentral(new JPanel());
		setPCentralIzquierda(new JPanel());
		setPCentralIzquierdaSuperior(new JPanel());
		setPCentralIzquierdaInferior(new JPanel());
		
		setLNick(new JLabel("Nick:"));
		setLUsuarios(new JLabel("Usuarios:"));
		setLMensaje(new JLabel("Mensaje:"));
		
		setBRegistrar(new JButton("Registrar"));
		getBRegistrar().addActionListener( new EventosBotones());
		setBEnviar(new JButton("Enviar"));
		getBEnviar().addActionListener( new EventosBotones());
		
		setTNick(new TextField(20));
		setTMensaje(new TextField(80));
		String texto= "";
		
		for(Persona usuario:listaUsuarios) {
			//texto = texto + usuario.getNick().toString(); 
		}
		System.out.println(texto);
		
	
		
		setTaMensajes(new TextArea());
		
		//this.add(getPGlobal());
		getContentPane().add(getPGlobal());
		getPGlobal().setLayout(new GridBagLayout());
		getPGlobal().setBackground(new Color(32, 232, 230));
		
		 //===================== Zona Superior: =============================
		 
		 GridBagConstraints gbc_Lnik  = new GridBagConstraints(0,0,1,1,0,10,GridBagConstraints.EAST,GridBagConstraints.NONE,new Insets(0,60,0,0),0,0);
		 getPGlobal().add(getLNick(),gbc_Lnik);
		 
		 GridBagConstraints  gbc_Tnik = new GridBagConstraints(1,0,1,1,40,10,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,20,0,0),0,0);
		 getPGlobal().add(getTNick(),gbc_Tnik);
		 
		 GridBagConstraints  gbc_Bregistrar = new GridBagConstraints(2,0,1,1,30,10,GridBagConstraints.WEST,GridBagConstraints.NONE,new Insets(0,20,0,40),0,0);
		 getPGlobal().add(this.getBRegistrar(),gbc_Bregistrar);
		 
		 
		 //===================== Zona Central: =============================
		 
		 GridBagConstraints gbc_Lusurarios = new GridBagConstraints(0,1,1,1,30,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		 getPGlobal().add(this.getLUsuarios(),gbc_Lusurarios);
		 
		 
		 GridBagConstraints  gbc_TAusurarios = new GridBagConstraints(0,2,1,1,0,70,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,20,0,0),0,0);
		 getPGlobal().add(this.getTaUsuarios(),gbc_TAusurarios);
		 
		 GridBagConstraints  gbc_TAmensajes = new GridBagConstraints(1,1,3,2,0,80,GridBagConstraints.WEST,GridBagConstraints.BOTH,new Insets(0,20,0,40),0,0);
		 getPGlobal().add(this.getTaMensajes(),gbc_TAmensajes);
		 
		 
		 
		 //===================== Zona Inferior: =============================
		 
		 GridBagConstraints   gbc_Lmensaje = new GridBagConstraints(0,3,1,1,0,10,GridBagConstraints.EAST,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		 getPGlobal().add(this.getLMensaje(),gbc_Lmensaje);
		 
		 GridBagConstraints   gbc_Tmensaje = new GridBagConstraints(1,3,1,1,80,10,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,20,0,0),0,0);
		 getPGlobal().add(this.getTMensaje(),gbc_Tmensaje);
		 
		 GridBagConstraints   gbc_Benviar = new GridBagConstraints(2,3,1,1,10,10,GridBagConstraints.WEST,GridBagConstraints.NONE,new Insets(0,20,0,0),0,0);
		 getPGlobal().add(this.getBEnviar(),gbc_Benviar);
		 
		 

	
	}
	
	public List<Persona>  cargaUsiarios() {
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Javier","1234","192.168.28.9"));
		lista.add(new Persona("Sara","2222","192.168.28.10"));
		lista.add(new Persona("Jacinto","3333","192.168.28.13"));
		lista.add(new Persona("Juan","4444","192.168.28.14"));
		lista.add(new Persona("Anna","5555","192.168.28.15"));
		lista.add(new Persona("Antonio","77777","192.168.28.17"));
		return lista;
	}
	
	public static void main(String[] args) {
		
		ChatB  chat = new ChatB();
		chat.setSize(500, 500);
		chat.setVisible(true);
		//chat.addWindowListener(chat);
		

		 chat.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		 

	}

}
