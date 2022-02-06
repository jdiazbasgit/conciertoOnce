/*package facturas.trabajo;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import facturas.beans.Factura;
import facturas.beans.Vendedor;

public class EjemploFactura {

	public static void main(String[] args) throws FileNotFoundException {
	
		Set<Vendedor> vendedores =cargaVendedores();
		int resultado=0;
		Set<Factura> facturas=cargaFacturas();

		//programacion sin funcional
	//	for (Factura factura : facturas) {
		//	resultado=resultado+factura.getBaseImponible();
		}
	//	System.err.println(resultado);
		
		//programación funcional
	//	System.out.println(facturas.stream().sorted().mapToInt(fac->fac.getBaseImponible()).
			//	filter(n->n<5000).filter(n->n<200).sum());
		
		//System.out.println(facturas.stream().mapToInt(fac->fac.getBaseImponible()).filter(n->n>=5000).sum());

		
		





	private static Set<Vendedor> cargaVendedores() {
		// TODO Auto-generated method stub
		return null;
	}




	private static Set<Factura> cargaFacturas() {
		// TODO Auto-generated method stub
		return null;
	}




	private static Set<Factura> cargaFacturas(Set<Vendedor> vendedores){
		TreeSet<Factura> salida= new TreeSet<>((f1,f2)->f1.getFecha().compareTo(f2.getFecha()));
		int numeroFactura=1;
		Random random= new Random();
		
		
		for (Vendedor vendedor : vendedores) {
			for(int i=0;i<10;i++) {
				
				int importe=(int)(random.nextFloat()*10000);
				Fecha fecha= new Fecha();
				fecha.add(Calendar.DAY_OF_MONTH, numeroFactura);
				Factura factura= new Factura(importe, numeroFactura, fecha, vendedor);
				salida.add(factura);
				numeroFactura++;
			}
			
		}
		
		return salida;
	}
	
       
	

		@SuppressWarnings("unused")
		private static <T> Set<Vendedor> cargaVendedores(Set<Vendedor> vendedores) {
			Set<Vendedor> salida=new HashSet<Vendedor>();
			    for(int i=0;i<20;i++) {
				salida.add(new Vendedor("nombre"+i, "dni"+i, "9191919"+i));
				//int a=Integer.parseInt("9191919"+i)-->91919191;
			}System.out.println();
			return salida;
		}


	


	private static Set<Vendedor> cargaVendedores() {
		Set<Vendedor> salida=new HashSet<Vendedor>();
		    for(int i=0;i<20;i++) {
			salida.add(new Vendedor("nombre"+i, "dni"+i, "9191919"+i));
			//int a=Integer.parseInt("9191919"+i)-->91919191;
		}System.out.println(salida.toString());
		return salida;
	}

}*/