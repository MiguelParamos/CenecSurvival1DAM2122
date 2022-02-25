package clases;

import superclases.Objeto;

/**
 * Representa la protecci�n de los jugadores y enemigos mediante puntos de defensa
 * @author Hugo M�rquez
 *
 */

public class Proteccion extends Objeto{
	/** Representan los puntos de defensa de los personajes */
	private byte puntosDefensa;


	/**
	 * Constructor de puntos de defensa
	 * @param puntosDefensa
	 */
	public Proteccion(byte puntosDefensa) {
		super();
		this.puntosDefensa = puntosDefensa;
	}
/**
 * getter de Puntos de defensa
 * @return puntos de defensa de la clase proteccion
 */
	public byte getPuntosDefensa() {
		return puntosDefensa;
	}
/**
 * setter de puntos de defensa
 * @param puntosDefensa de la clase Proteccion
 */
	public void setPuntosDefensa(byte puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}
	
}
