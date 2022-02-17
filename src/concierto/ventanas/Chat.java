package concierto.ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Data
@EqualsAndHashCode(callSuper = false)
@Setter




public class Chat extends JFrame {
	
	private JPanel pGlobal;
	private JButton bRegistrar, bEnviar;
	private JTextField tNick, tMensaje;
	private JLabel lNick, lUsuarios, lMensaje;
	private TextArea taUsuarios, taMensajes;
	private Color color = new Color(32, 232, 230); 
	Font mifuente = new Font(Font.SANS_SERIF, 1, 12);
	
	
	public Chat() {
		setContentPane(new JPanel());
		setLNick(new JLabel("Nick:"));
		setLUsuarios(new JLabel("Usuarios:"));
		setLMensaje(new JLabel("Mensaje:"));
		setBEnviar(new JButton("Enviar"));
		setBRegistrar(new JButton("Registrar"));
		setTNick(new JTextField(20));
		setTMensaje(new JTextField(200));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(20, 1));

		getContentPane().setLayout(new GridBagLayout());
		getContentPane().setBackground(color);
		getContentPane().setFont(mifuente);
		
		 //===================== Zona Superior: =============================
		 
		 GridBagConstraints gbc_Lnik  = new GridBagConstraints(0,0,1,1,0,10,GridBagConstraints.EAST,GridBagConstraints.NONE,new Insets(0,60,0,0),0,0);
		 getContentPane().add(getLNick(),gbc_Lnik);
		 
		 GridBagConstraints  gbc_Tnik = new GridBagConstraints(1,0,1,1,40,10,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,20,0,0),0,0);
		 getContentPane().add(getTNick(),gbc_Tnik);
		 
		 GridBagConstraints  gbc_Bregistrar = new GridBagConstraints(2,0,1,1,30,10,GridBagConstraints.WEST,GridBagConstraints.NONE,new Insets(0,20,0,40),0,0);
		 getContentPane().add(this.getBRegistrar(),gbc_Bregistrar);
		 
		 
		 //===================== Zona Central: =============================
		 
		 GridBagConstraints gbc_Lusurarios = new GridBagConstraints(0,1,1,1,30,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		 getContentPane().add(this.getLUsuarios(),gbc_Lusurarios);
		 
		 
		 GridBagConstraints  gbc_TAusurarios = new GridBagConstraints(0,2,1,1,0,70,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0);
		 getContentPane().add(this.getTaUsuarios(),gbc_TAusurarios);
		 
		 GridBagConstraints  gbc_TAmensajes = new GridBagConstraints(1,1,3,2,0,80,GridBagConstraints.WEST,GridBagConstraints.BOTH,new Insets(0,20,0,0),0,0);
		 getContentPane().add(this.getTaMensajes(),gbc_TAmensajes);
		 
		 
		 
		 //===================== Zona Inferior: =============================
		 
		 GridBagConstraints   gbc_Lmensaje = new GridBagConstraints(0,3,1,1,0,10,GridBagConstraints.EAST,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0);
		 getContentPane().add(this.getLMensaje(),gbc_Lmensaje);
		 
		 GridBagConstraints   gbc_Tmensaje = new GridBagConstraints(1,3,1,1,80,10,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,20,0,0),0,0);
		 getContentPane().add(this.getTMensaje(),gbc_Tmensaje);
		 
		 GridBagConstraints   gbc_Benviar = new GridBagConstraints(2,3,1,1,10,10,GridBagConstraints.WEST,GridBagConstraints.NONE,new Insets(0,20,0,0),0,0);
		 getContentPane().add(this.getBEnviar(),gbc_Benviar);
		 
		 
		
	}
	
	
	

	public static void main(String[] args)  {
		 Chat chat = new  Chat();
		 chat.setSize(600, 600);
		 chat.setVisible(true);
		 chat.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}

}
