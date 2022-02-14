


import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;



public class Chat {
	private Panel pGlobal,pSuperior,pCentral,pInferior,pCentralIzquierda,pCentralIzquierdaSuperior,pCentralIzquierdaInferior;
	private Label lNick, lUsuarios, lMensaje;
	private Button bRegistrar,bEnviar;
	private TextField tNick,tMensaje;
	private TextArea taUsuarios,taMensajes;
	
	
	public Chat() {
		
		//Vamos a colocal los 7 paneles
		setpGlobal(new Panel());
		setpSuperior(new Panel());
		setpCentral(new Panel());
		setpInferior(new Panel());
		setpCentralIzquierda(new Panel());
		setpCentralIzquierdaSuperior(new Panel());
		setpCentralIzquierdaInferior(new Panel());
		//Vamos a contruir los Label que como constructor tiene una etiqueta
		setlNick(new Label("Nick:"));
		setlMensaje(new Label("Usuarios"));
		setlMensaje(new Label("Mensaje:"));
		//Colocamos los botones
		setbEnviar(new Button("Enviar"));
		setbRegistrar(new Button("Registrar"));
		//Creamos el TextField que tenemos que indicarle el ancho de la ventana en el contructor
		// que en nuetro caso será de 80 por defecto
		settNick(new TextField(80) );
		settMensaje(new TextField(80) );
		//Creamos un TextArea para el emnsaje
		setTaMensajes(new TextArea());
	    setTaUsuarios(new TextArea());
	    
	    this.getpSuperior().setLayout(new FlowLayout());
	    this.getpSuperior().add(this.getlNick());
	    this.getpSuperior().add(this.gettNick());
	    this.getpSuperior().add(this.getbRegistrar());
	    this.getpSuperior().setBackground(Color.GRAY);
	    
	    this.getpInferior().setLayout(new FlowLayout());
	    this.getpInferior().add(this.getlMensaje());
	    this.getpInferior().add(this.getlMensaje());
	    this.getpInferior().add(this.getbEnviar());
	    this.getpInferior().setBackground(Color.PINK);
	    
	    this.getpGlobal().setLayout(new BorderLayout());
	    this.getpGlobal().add(this.getpSuperior(),BorderLayout.NORTH);
	    this.getpGlobal().add(this.getpInferior(),BorderLayout.SOUTH);
	    
	    setLayout(new BorderLayout());
	    add(getpGlobal(),BorderLayout.CENTER);
	    
		
		
		
	}





	public static void main(String[] args) {
        Chat chat = new Chat();
        chat.setSize(500,500);
        chat.setVisible(true);

	}


	public Panel getpGlobal() {
		return pGlobal;
	}


	public void setpGlobal(Panel pGlobal) {
		this.pGlobal = pGlobal;
	}


	public Panel getpSuperior() {
		return pSuperior;
	}


	public void setpSuperior(Panel pSuperior) {
		this.pSuperior = pSuperior;
	}


	public Panel getpCentral() {
		return pCentral;
	}


	public void setpCentral(Panel pCentral) {
		this.pCentral = pCentral;
	}


	public Panel getpInferior() {
		return pInferior;
	}


	public void setpInferior(Panel pInferior) {
		this.pInferior = pInferior;
	}


	public Panel getpCentralIzquierda() {
		return pCentralIzquierda;
	}


	public void setpCentralIzquierda(Panel pCentralIzquierda) {
		this.pCentralIzquierda = pCentralIzquierda;
	}


	public Panel getpCentralIzquierdaSuperior() {
		return pCentralIzquierdaSuperior;
	}


	public void setpCentralIzquierdaSuperior(Panel pCentralIzquierdaSuperior) {
		this.pCentralIzquierdaSuperior = pCentralIzquierdaSuperior;
	}


	public Panel getpCentralIzquierdaInferior() {
		return pCentralIzquierdaInferior;
	}


	public void setpCentralIzquierdaInferior(Panel pCentralIzquierdaInferior) {
		this.pCentralIzquierdaInferior = pCentralIzquierdaInferior;
	}


	public Label getlNick() {
		return lNick;
	}


	public void setlNick(Label lNick) {
		this.lNick = lNick;
	}


	public Label getlUsuarios() {
		return lUsuarios;
	}


	public void setlUsuarios(Label lUsuarios) {
		this.lUsuarios = lUsuarios;
	}


	public Label getlMensaje() {
		return lMensaje;
	}


	public void setlMensaje(Label lMensaje) {
		this.lMensaje = lMensaje;
	}


	public Button getbRegistrar() {
		return bRegistrar;
	}


	public void setbRegistrar(Button bRegistrar) {
		this.bRegistrar = bRegistrar;
	}


	public Button getbEnviar() {
		return bEnviar;
	}


	public void setbEnviar(Button bEnviar) {
		this.bEnviar = bEnviar;
	}


	public TextField gettNick() {
		return tNick;
	}


	public void settNick(TextField tNick) {
		this.tNick = tNick;
	}


	public TextField gettMensaje() {
		return tMensaje;
	}


	public void settMensaje(TextField tMensaje) {
		this.tMensaje = tMensaje;
	}


	public TextArea getTaUsuarios() {
		return taUsuarios;
	}


	public void setTaUsuarios(TextArea taUsuarios) {
		this.taUsuarios = taUsuarios;
	}


	public TextArea getTaMensajes() {
		return taMensajes;
	}


	public void setTaMensajes(TextArea taMensajes) {
		this.taMensajes = taMensajes;
	}
	
	
	
	
}
