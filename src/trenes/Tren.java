package trenes;

public class Tren implements Comparable<Tren>{
	
	private String origen;
	private String destino;
	private int pasajeros;
	
	
	public Tren(String origen, String destino, int pasajeros) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.pasajeros = pasajeros;
	}
	
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Tren [origen=" + getOrigen() + ", destino=" + getDestino() + ", pasajeros=" + getPasajeros() + "]" + hashCode();
	}

	@Override
	public int compareTo(Tren otro) {
		
		return this.getDestino().compareTo(otro.getDestino());
	}


}
