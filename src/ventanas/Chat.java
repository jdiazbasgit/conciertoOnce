package ventanas;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@Data
@EqualsAndHashCode(callSuper = false)
public class Chat extends Frame {
	private Panel pGlobal, pSuperior, pCentral, pInferior, pCentralIzquierda, pCentralIzquierdaSuperior,
			pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar, bEnviar;
	private TextField tNick, tMensaje;
	private TextArea taUsuarios, taMensajes;

	public Chat() {
		setPGlobal(new Panel());
		setPSuperior(new Panel());
		setPCentral(new Panel());
		setPInferior(new Panel());
		setPCentralIzquierda(new Panel());
		setPCentralIzquierdaSuperior(new Panel());
		setPCentralIzquierdaInferior(new Panel());
		setLNick(new Label("NICK:"));
		setLUsuarios(new Label("USUARIOS"));
		setLMensaje(new Label("MENSAJE:"));
		setBEnviar(new Button("ENVIAR"));
		setBRegistrar(new Button("REGISTRAR"));
		setTNick(new TextField(20));
		setTMensaje(new TextField(80));
		setTaMensajes(new TextArea());
		setTaUsuarios(new TextArea(2, 20));

		getPSuperior().setLayout(new FlowLayout());
		getPSuperior().add(getLNick());
		getPSuperior().add(getTNick());
		getPSuperior().add(getBRegistrar());
		getPSuperior().setBackground(Color.GRAY);

		getPInferior().setLayout(new FlowLayout());
		getPInferior().add(getLMensaje());
		getPInferior().add(getTMensaje());
		getPInferior().add(getBEnviar());
		getPInferior().setBackground(Color.PINK);

		getPCentralIzquierdaSuperior().setLayout(new FlowLayout());
		getPCentralIzquierdaSuperior().add(getLUsuarios());

		getPCentralIzquierdaInferior().setLayout(new BorderLayout());
		getPCentralIzquierdaInferior().add(getTaUsuarios(), BorderLayout.CENTER);

		getPCentralIzquierda().setLayout(new BorderLayout());
		getPCentralIzquierda().add(getPCentralIzquierdaSuperior(), BorderLayout.NORTH);
		getPCentralIzquierda().add(getPCentralIzquierdaInferior(), BorderLayout.CENTER);

		getPCentral().setLayout(new BorderLayout());
		getPCentral().add(getPCentralIzquierda(), BorderLayout.WEST);
		getPCentral().add(getTaMensajes(), BorderLayout.CENTER);

		getPGlobal().setLayout(new BorderLayout());
		getPGlobal().add(getPSuperior(), BorderLayout.NORTH);
		getPGlobal().add(getPInferior(), BorderLayout.SOUTH);
		getPGlobal().add(getPCentral(), BorderLayout.CENTER);

		this.setLayout(new BorderLayout());
		this.add(getPGlobal(), BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		Chat chat = new Chat();
		chat.setSize(500, 500);
		chat.setVisible(true);
	}
	
	private Container getPGlobal() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component getTaMensajes() {
		// TODO Auto-generated method stub
		return null;
	}

	private Container getPCentral() {
		// TODO Auto-generated method stub
		return null;
	}

	private Container getPCentralIzquierda() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component getTaUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	private Container getPCentralIzquierdaInferior() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component getLUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	private Container getPCentralIzquierdaSuperior() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component getBEnviar() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component getTMensaje() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component getLMensaje() {
		// TODO Auto-generated method stub
		return null;
	}

	private Container getPInferior() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component getBRegistrar() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component getTNick() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component getLNick() {
		// TODO Auto-generated method stub
		return null;
	}

	private Container getPSuperior() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setTaUsuarios(TextArea textArea) {
		// TODO Auto-generated method stub
		
	}

	private void setTaMensajes(TextArea textArea) {
		// TODO Auto-generated method stub
		
	}

	private void setTMensaje(TextField textField) {
		// TODO Auto-generated method stub
		
	}

	private void setTNick(TextField textField) {
		// TODO Auto-generated method stub
		
	}

	private void setBRegistrar(Button button) {
		// TODO Auto-generated method stub
		
	}

	private void setBEnviar(Button button) {
		// TODO Auto-generated method stub
		
	}

	private void setLMensaje(Label label) {
		// TODO Auto-generated method stub
		
	}

	private void setLUsuarios(Label label) {
		// TODO Auto-generated method stub
		
	}

	private void setLNick(Label label) {
		// TODO Auto-generated method stub
		
	}

	private void setPCentralIzquierdaInferior(Panel panel) {
		// TODO Auto-generated method stub
		
	}

	private void setPCentralIzquierdaSuperior(Panel panel) {
		// TODO Auto-generated method stub
		
	}

	private void setPCentralIzquierda(Panel panel) {
		// TODO Auto-generated method stub
		
	}

	private void setPInferior(Panel panel) {
		// TODO Auto-generated method stub
		
	}

	private void setPCentral(Panel panel) {
		// TODO Auto-generated method stub
		
	}

	private void setPSuperior(Panel panel) {
		// TODO Auto-generated method stub
		
	}

	private void setPGlobal(Panel panel) {
		// TODO Auto-generated method stub
		
	}



}
