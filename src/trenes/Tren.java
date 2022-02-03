package trenes;
/*
 1.-hacer colección set y meter trenes. 
2- Crear criterio igualdad donde todos los trenes con el mismo destino los consideramos iguales
3.-Listar los trenes del Set ordenados por número de pasajeros Con Hashset?

4.- Map = nombre del tren(tren1,tren2..) como key y el objeto tren como value

 */
import java.util.Objects;

public class Tren implements Comparable<Tren>{
 
	private String origen;
	private String destino;
	private int pasajeros;
	
	
	
	public Tren(String origen, String destino, int pasajeros) {
		this.origen = origen;
		this.destino = destino;
		this.pasajeros = pasajeros;
	}
		
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	/**
	 * @return the pasajeros
	 */
	public int getPasajeros() {
		return pasajeros;
	}
	/**
	 * @param pasajeros the pasajeros to set
	 */
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Tren [origen=" + getOrigen() + ", destino=" + getDestino() + ", pasajeros=" + getPasajeros() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(destino);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tren other = (Tren) obj;
		return Objects.equals(destino, other.destino);
	}

	@Override
	public int compareTo(Tren otroTren) {
		if (Objects.equals(this.getDestino(), otroTren.getDestino()))
			return 0;
		return Integer.compare(this.getPasajeros(), otroTren.getPasajeros());
	}
	
	
}
