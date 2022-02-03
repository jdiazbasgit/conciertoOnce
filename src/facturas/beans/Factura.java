package facturas.beans;

import java.util.GregorianCalendar;

public class Factura {
	
	private int baseImponible;
	private int numeroFactura;
	private GregorianCalendar fecha;
	private Vendedor vendedor;
	
	public Factura(int baseImponible, int numeroFactura, GregorianCalendar fecha, Vendedor vendedor) {
		super();
		this.baseImponible = baseImponible;
		this.numeroFactura = numeroFactura;
		this.fecha = fecha;
		this.vendedor = vendedor;
	}
	
	

	



	public Factura(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}







	@Override
	public String toString() {
		return "Factura [baseImponible=" + baseImponible + ", numeroFactura=" + numeroFactura + ", fecha=" + fecha
				+ ", vendedor=" + vendedor + "]";
	}

	public int getBaseImponible() {
		return baseImponible;
	}
	public void setBaseImponible(int baseImponible) {
		this.baseImponible = baseImponible;
	}
	public int getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public static void add(Factura factura) {
		// TODO Auto-generated method stub
		
	}

}
