package layouts;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

import ventanas.VentanaBolas;
import ventanas.eventos.EventosRaton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
public class EjemploGridBagLayout extends Frame {

	
	
	public EjemploGridBagLayout(){
		Panel panel= new Panel();
		this.add(panel);
		Button b1= new Button("1");
		Button b2= new Button("2");
		Button b3= new Button("3");
		Button b4= new Button("4");
		Button b5= new Button("5");
		
		VentanaBolas ventanaBolas= new VentanaBolas();
		panel.setLayout(new GridBagLayout());
		ventanaBolas.setBackground(Color.PINK);
		b1.addActionListener(new EventosRaton(ventanaBolas));
		GridBagConstraints gb1= new GridBagConstraints(0,0,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0);
		panel.add(b1,gb1);
		GridBagConstraints gb2= new GridBagConstraints(1,1,1,1,2,2,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0);
		panel.add(ventanaBolas,gb2);
		GridBagConstraints gb3= new GridBagConstraints(2,2,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0);
		panel.add(b3,gb3);
		
	}
	
	
	
	public static void main(String[] args) {
		EjemploGridBagLayout ejemploGridBagLayout= new EjemploGridBagLayout();
		ejemploGridBagLayout.setSize(500,500);
		ejemploGridBagLayout.setVisible(true);
		

	}

}
