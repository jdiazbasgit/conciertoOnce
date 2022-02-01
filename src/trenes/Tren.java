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
		return "Tren [origen=" + getOrigen() + ", destino=" + getDestino() + ", pasajeros=" + getPasajeros() + " , hashCode= "+ hashCode() +"]";
	}

	@SuppressWarnings("removal")
	public int compareTo(Integer o) {
		
		Integer pasajeros = new Integer(this.getPasajeros());
		Integer pasajerosObject = new Integer(o);
		return pasajeros.compareTo(pasajerosObject);
	}
	

	
	@SuppressWarnings("removal")
	public int hashCode() {
		Integer pasajeros = new Integer(this.getPasajeros());
		return pasajeros.hashCode();
	}

	public boolean equals(Tren obj) {
		
		return this.getPasajeros() == obj.getPasajeros();
	}

	@Override
	public int compareTo(Tren o) {
		
		return this.getDestino().compareTo(o.getDestino());
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getDestino().equals(((Tren) obj).getDestino());
	}

	



}
