package arkanoid.eventos;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import arkanoid.hilos.Bola;
import arkanoid.ventanas.Nave;
import arkanoid.ventanas.VentanaArkanoid;
public class GestorEventosAdapter implements MouseListener,WindowListener,KeyListener {
	
	 
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
   

	@Override
	public void windowClosing(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e)  {
				
		
		 switch(e.getKeyCode()){
		
		                 case KeyEvent.VK_DOWN:
		                		
		                 break;
		                 case KeyEvent.VK_UP:
		                	
		                 break;
		                 case KeyEvent.VK_RIGHT:
		             		
		                 break;
		                 case KeyEvent.VK_LEFT:
		                	
		                 break;
		             }
		             repaint();
		         }

		
	



	


	


	





	

	private VentanaArkanoid getVentanaArkanoid() {
		// TODO Auto-generated method stub
		return null;
	}



	private void repaint() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
