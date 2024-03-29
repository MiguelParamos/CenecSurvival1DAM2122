package clases;

import excepciones.NombreVacioException;
import superclases.Objeto;

/**
 * Representa un objeto que sumara la vida actual del personaje.
 * 
 * @author Alejandro
 * 
 */
public class Pocion extends Objeto {
	/**
	 * cantidadPuntosRestaurados --> Representa la cantidad de punto que sumará la
	 * vida del personaje
	 */
	private byte cantidadPuntoRestaurados;

	/**
	 * Constructor de poción con todos sus campos
	 * 
	 * @param nombre                   nombre de la poción
	 * @param precio                   precio de la poción
	 * @param cantidadPuntoRestaurados cantidad de puntos de vida que restaura la
	 *                                 poción
	 * @throws NombreVacioException 
	 */
	public Pocion(String nombre, byte precio, byte cantidadPuntoRestaurados) throws NombreVacioException {
		super(nombre, precio);
		this.cantidadPuntoRestaurados = cantidadPuntoRestaurados;
	}

	/**
	 * getter de pocion
	 * 
	 * @return devuelve la cantidad de puntos de salud que se restauran al tomar una
	 *         poción
	 */
	public byte getCantidadPuntoRestaurados() {
		return cantidadPuntoRestaurados;
	}

	/**
	 * setter de pocion
	 * 
	 * @param cantidadPuntoRestaurados devuelve la cantidad de puntos de salud que
	 *                                 se restauran al tomar una poción
	 */
	public void setCantidadPuntoRestaurados(byte cantidadPuntoRestaurados) {
		this.cantidadPuntoRestaurados = cantidadPuntoRestaurados;
	}

	/**
	 * función toString, que muestra la información del objeto
	 * 
	 * @return String con la información del objeto en una sola línea
	 */
	public String toString() {
		return "Poción: " + this.getNombre() + " | Puntos que restaura: " + this.cantidadPuntoRestaurados
				+ " | sPrecio: " + this.getDinero();
	}

}