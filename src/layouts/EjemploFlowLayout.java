package layouts;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.FlowLayout;
public class EjemploFlowLayout extends Frame {

	
	EjemploFlowLayout(){
		Panel panel= new Panel();
		this.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT,20,40));
		for(int i=0;i<10;i++) {
			Button button= new Button(String.valueOf(i));
			panel.add(button);
		}
	}
}
