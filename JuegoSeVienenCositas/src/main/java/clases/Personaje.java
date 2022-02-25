package clases;

import superclases.EntidadConMonedas;

/**
 * Representa el nombre del jugador, su vida, arma y proteccion
 * @author Cristian Cocargeanu
 */
public class Personaje extends EntidadConMonedas {
	/**
	 * Representa los puntos de vida del personaje
	 */
	private short vida;
	/**
	 * Representa los puntos de ataque del arma
	 */
	private Arma arma;
	/**
	 * Representa los puntos de proteccion de la defensa
	 */
	private Proteccion proteccion;
	/**
	 * Representa el nombre del personaje
	 */
	private String nombre;
	
	
}
