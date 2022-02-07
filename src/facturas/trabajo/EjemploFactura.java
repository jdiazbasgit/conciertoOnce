package facturas.trabajo;

import java.util.Calendar;
import java.util.HashSet;
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
		
		vendedores.stream().filter( v->Integer.parseInt(v.getTelefono())%2==0).sorted((v1,v2)->Integer.parseInt(v1
				.getTelefono())-Integer.parseInt(v2.getTelefono())).forEach(v->System.out.println(v.getTelefono()));
	}
		
	
		
		/*//Programacion sin funcional
		for (Factura factura : facturas) {
			resultado=resultado+factura.getBaseImponible();
			System.out.println(factura.getNumeroFactura()+ " - " + factura.getFecha() + " - " + factura.getBaseImponible());
		}
		//Programacion Funcional
		System.out.println(facturas.stream().sorted().mapToInt(fac->fac.getBaseImponible()).filter(n->n>=5000).sum());//Da error de casteo pero compila
		System.out.println(facturas.stream().mapToInt(fac->fac.getBaseImponible()).filter(n->n>=5000).sum());
	}*/
	
	
	

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
		Set<Vendedor> salida=new HashSet<>();
		for(int i=0;i<20;i++) {
			
			Random random = new Random();
			String nombre="pepe" +i;
			String dni= "1234556" +i;
			String telefono= "919191" +i;
			Vendedor vendedor= new Vendedor( nombre,telefono, dni);
			salida.add(vendedor);
			
			//System.out.println("vendedor: " + vendedor.getNombre() +"   " + "dni: " + vendedor.getDni() +"   " + "teléfono: " + vendedor.getTelefono()+ "   " );//Borrando linea 75 saca TreeSet correcto de 20 vendedores
			
		}
		return salida;
		
		
	}
}


