package facturas.trabajo;

import java.util.Calendar;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import factura.fechas.Fecha;
import facturas.beans.Factura;
import facturas.beans.Vendedor;

public class EjemploFactura {

	public static void main(String[] args) {
		
		Set<Vendedor> vendedores=cargaVendedores();
		Set<Factura> facturas=cargaFacturas(vendedores);
		int resultado=0;
		
	}
		
	/*	//Programacion sin funcional
		for (Factura factura : facturas) {
			resultado=resultado+factura.getBaseImponible();
			System.out.println(factura.getNumeroFactura()+ " - " + factura.getFecha() + " - " + factura.getBaseImponible());
		}
		//Programacion Funcional
		System.out.println(facturas.stream().sorted().mapToInt(fac->fac.getBaseImponible()).filter(n->n>=5000).sum());//Da error de casteo pero compila
		System.out.println(facturas.stream().mapToInt(fac->fac.getBaseImponible()).filter(n->n>=5000).sum());
	}
	*/
	
	

	private static Set<Factura> cargaFacturas(Set<Vendedor> vendedores) {
		TreeSet<Factura> salida= new TreeSet<>((f1,f2)->f1.getFecha().compareTo(f2.getFecha()));
		int numeroFactura=1;
		Random random = new Random();
		for(int i=0; i<10; i++){
		
	}
	
	for (Vendedor vendedor: vendedores) {
		for(int i=0; i<10; i++) {
			int importe=(int)(random.nextFloat()*10000);
			Fecha fecha = new Fecha();
			fecha.add(Calendar.DAY_OF_MONTH, numeroFactura);
			Factura factura= new Factura(importe, numeroFactura, fecha, vendedor);
			salida.add(factura);
			numeroFactura++;
		}
		
			
		}
		
		return salida;
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
		}
		return salida;
		
	
	}
}


