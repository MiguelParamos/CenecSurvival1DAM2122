package clases;

import superclases.Objeto;

/**
 * Representa un arma con unos puntos de ataque y un nombre, que los jugadores y enemigos
 * usarán para atacar
 * @author Juanjo Medina
 * @author MParamos
 *
 */
public class Arma extends Objeto{
	
	/** representa los puntos de ataque del arma **/
	private byte puntosAtaque;

	/**
	 * Constructor de la clase arma
	 */
	public Arma() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter de puntosAtaque
	 * @return puntosAtaque de la clase arma
	 */
	public byte getPuntosAtaque() {
		return puntosAtaque;
	}

	/**
	 * setter de puntosAtaque
	 * @param puntosAtaque de la clase arma
	 */
	public void setPuntosAtaque(byte puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}
	
	
	
	
}
