package ejemploFlowLayout;

import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Button;
public class EjemploBorderLayout {

	
		public EjemploBorderLayout() {
			
			Panel panel= new Panel();
			this.add(panel);
			Button b1= new Button("1");
			Button b2= new Button("2");
			Button b3= new Button("3scfdsfdsfsdf");
			Button b4= new Button("4");
			Button b5= new Button("5");
			panel.setLayout(new BorderLayout());
			panel.add(b1,BorderLayout.NORTH);
			panel.add(b2,BorderLayout.SOUTH);
			panel.add(b3,BorderLayout.EAST);
			panel.add(b4,BorderLayout.WEST);
			panel.add(b5,BorderLayout.CENTER);
			
			
			
			
			
		}
		
	
			
		

		public static void main(String[] args) {
			
		}
	

}
