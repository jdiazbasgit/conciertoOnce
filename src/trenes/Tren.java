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
		return "Tren [origen=" + getOrigen() + ", destino=" + getDestino() + ", pasajeros=" + getPasajeros() + "]";
	}

	@Override
	public int compareTo(Tren o) {
		
		return this.getDestino().compareTo(o.getDestino());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getDestino().hashCode();
	}

	public boolean equals(Tren obj) {
		
		return this.getDestino().equals(obj.getDestino());
	}



}
