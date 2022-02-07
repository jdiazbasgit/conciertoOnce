package facturas.beans;

import java.util.Comparator;

import facturas.fecha.Fecha;

public class Factura implements Comparator<Factura> {

	private int baseImponible;
	private int numeroFactura;
	private Fecha fecha;
	private Vendedor vendedor;
	

	public Factura(int baseImponible, int numeroFactura, Fecha fecha, Vendedor vendedor) {
		super();
		this.baseImponible = baseImponible;
		this.numeroFactura = numeroFactura;
		this.fecha = fecha;
		this.vendedor = vendedor;
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

	

	public Fecha getFecha() {
		return fecha;
	}



	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}



	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}



	@Override
	public int compare(Factura o1, Factura o2) {
		
		return this.getFecha().compareTo(o1.getFecha());
	}

}
