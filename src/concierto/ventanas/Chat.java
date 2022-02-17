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
//import javax.swing.JFrame;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@SuppressWarnings("serial")
public class Chat extends EventosVentana {
	private Panel pGlobal, pSuperior, pInferior, pCentral, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;
	private Color color;

	public Chat() {
		Font mi_fuente = new Font("Calibri", 1, 12);
		setPGlobal(new Panel());
		setPSuperior(new Panel());
		setPInferior(new Panel());
		setPCentral(new Panel());
		setPCentralIzquierda(new Panel());
		setPCentralIzquierdaSuperior(new Panel());
		setPCentralIzquierdaInferior(new Panel());
		
		setLNick(new Label("Nick:"));
		setLUsuarios(new Label("Usuarios:"));
		setLMensaje(new Label("Mensaje:"));
		
		setBRegistrar(new Button("Registrar"));
		setBEnviar(new Button("Enviar"));
		
		setTNick(new TextField(20));
		setTMensaje(new TextField(80));
		
		setTaUsuarios(new TextArea(2,20));
		setTaMensajes(new TextArea());
		
		this.add(getPGlobal());
		getPGlobal().setLayout(new GridBagLayout());
		getPGlobal().setFont(mi_fuente);
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
	
	public static void main(String[] args) {
		
		Chat  chat = new Chat();
		chat.setSize(500, 500);
		chat.setVisible(true);
		chat.addWindowListener(chat);
		
		/*
		 * by grupo 3:
		 * ...
		 * import javax.swing.JFrame
		 * ...
		 *  ... class Chat extends JFrame{ ...
		 *  ... 
		 *  chat.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		 */

	}

}
