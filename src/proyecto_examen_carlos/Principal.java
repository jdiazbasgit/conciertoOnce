package proyecto_examen_carlos;

public class Principal {

	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones(5, 8);
		
		
		
		
	    System.out.println("La suma de 5 y 8 es: "+operaciones.suma());
        
	  
	    
	    System.out.println("Segunda forma");
	    Operaciones operaciones2 = new Operaciones();
	    operaciones2.setNumero1(5);
	    operaciones2.setNumero2(8);
	    System.out.println("La suma de 5 y 8 es: "+operaciones.suma2());
	    
	  
	}

}
