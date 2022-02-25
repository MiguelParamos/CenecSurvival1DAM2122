package clases;

import superclases.Objeto;

/**
 * Representa un objeto que sumara la vida actual del personaje.
 * 
 * @author Alejandro
 * 
 */
public class Pocion extends Objeto {
	/**
	 * cantidadPuntosRestaurados --> Representa la cantidad de punto que sumarÃ¡ la
	 * vida del personaje
	 */
	private byte cantidadPuntoRestaurados;

	/**
	 * Este es un constructor que permite trabajar con las variables de la
	 * superclase
	 * 
	 * @param nombre                   es el nombre del jugador,es una variable
	 *                                 heredada
	 * @param dinero                   es el dinero acumulado del jugador,es una
	 *                                 variable heredada
	 * @param cantidadPuntoRestaurados esta variable se usa para calcular la
	 *                                 cantidad de vida que recupera el personaje al
	 *                                 recuperar vida
	 */
	public Pocion(String nombre, byte dinero, byte cantidadPuntoRestaurados) {
		super(nombre, dinero);
		this.cantidadPuntoRestaurados = cantidadPuntoRestaurados;
	}

	/**
	 * getter de pocion
	 * 
	 * @return cantidadPuntoRestaurados devuelve la cantidad de puntos de salud que
	 *         se restauran al tomar una poción
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

}