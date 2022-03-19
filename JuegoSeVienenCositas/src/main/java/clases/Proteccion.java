package clases;

import superclases.Objeto;

/**
 * Representa la protección de los jugadores y enemigos mediante puntos de
 * defensa
 * 
 * @author Hugo Márquez
 *
 */

public class Proteccion extends Objeto {
	/** Representan los puntos de defensa que otorga esta protección */
	private byte puntosDefensa;

	/**
	 * Constructor con todos los campos de Protección
	 * 
	 * @param nombre        nombre de la protección
	 * @param precio        precio de la protección
	 * @param puntosDefensa puntos de defensa que otorga la protección
	 */
	public Proteccion(String nombre, byte precio, byte puntosDefensa) {
		super(nombre, precio);
		this.puntosDefensa = puntosDefensa;
	}

	/**
	 * getter de Puntos de defensa
	 * 
	 * @return puntos de defensa de la clase proteccion
	 */
	public byte getPuntosDefensa() {
		return puntosDefensa;
	}

	/**
	 * setter de puntos de defensa
	 * 
	 * @param puntosDefensa nueva cantidad de puntos de defensa que otorga la
	 *                      Proteccion
	 */
	public void setPuntosDefensa(byte puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}

	/**
	 * función toString, que muestra la información del objeto
	 * 
	 * @return String con la información del objeto en una sola línea
	 */
	public String toString() {
		return "Protección: " + this.getNombre() + " | Defensa: " + this.puntosDefensa + " | Precio: "
				+ this.getDinero();
	}

}
