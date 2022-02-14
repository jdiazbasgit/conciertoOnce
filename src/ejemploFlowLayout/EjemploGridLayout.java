package ejemploFlowLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
public class EjemploGridLayout {


		
		EjemploGridLayout extends Frame{
			Panel panel= new Panel();
			this.add(panel);
			Button b1= new Button("1");
			Button b2= new Button("2");
			Button b3= new Button("3scfdsfdsfsdf");
			Button b4= new Button("4");
			Button b5= new Button("5");
			panel.setLayout(new GridLayout(2,3,40,40));
			panel.add(b1);
			panel.add(b2);
			panel.add(b3);
			panel.add(b4);
			panel.add(b5);
		}
		
		public static void main(String[] args) {
			EjemploGridLayout ejemploGridLayout=new EjemploGridLayout();
			ejemploGridLayout.setSize(500,500);
			ejemploGridLayout.setVisible(true);
		

	}

}
