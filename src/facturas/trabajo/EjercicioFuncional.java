
package facturas.trabajo;

import java.util.Calendar;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import facturas.beans.Vendedor;
import facturas.fechas.Fecha;

public class EjercicioFuncional {

	@SuppressWarnings("unused")
public static void main(String[] args) {
		
		Set<Vendedor> vendedores=cargaVendedores();
		
		int resultado=0;
		for (Vendedor vendedor : vendedores) {
			resultado=resultado+vendedor.getNombre();
		}
			System.err.println(resultado);}
		
			@SuppressWarnings("unused")
			private static Set<Vendedor> cargaFacturas(Set<Vendedor> vendedores){
				TreeSet<Vendedor> salida= new TreeSet<>((f1,f2)->compareTo(f1).compareTo(compareTo(f2)));
				int numeroFactura=1;
				Random random= new Random();
				
				
				for (Vendedor vendedor : vendedores) {
					for(int i=0;i<10;i++) {
						
						int importe=(int)(random.nextFloat()*10000);
						Fecha fecha= new Fecha();
						fecha.add(Calendar.DAY_OF_MONTH, numeroFactura);
						String dni = null;
						String telefono = null;
						String nombre = null;
						Vendedor vendedor1= new Vendedor("Vendedor [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]");
						salida.add(vendedor);
						numeroFactura++;
					}
					
				}
				return salida;
	}


	private static Calendar compareTo(Vendedor f1) {
				// TODO Auto-generated method stub
				return null;
			}
	private static Set<Vendedor> cargaVendedores() {
		TreeSet<Vendedor> salida=new TreeSet<>();
		for(int i=0;i<20;i++) {
			Random random = new Random();
			int nombre=(int)(random.nextInt());
			int dni=(int)(random.nextInt());
			int telefono=(int)(random.nextInt());
			Vendedor vendedor= new Vendedor( nombre,telefono, dni);
			salida.add(vendedor);
			salida.add(new Vendedor(nombre+i, dni+i, telefono+i));
			System.out.println("vendedor: " + vendedor.getNombre() +"   " + "dni: " + vendedor.getDni() +"   " + "teléfono: " + vendedor.getTelefono()+ "   " );
		}System.out.println(salida.stream().filter(t ->true).mapToInt(value ->20 ).sum()); {
			
		} 
		return salida;}}
		
	








		
		
		
	
			


 

 
    

    
    
    
    
    

