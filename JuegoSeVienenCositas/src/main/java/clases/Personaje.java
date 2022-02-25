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
	
	/**
	 * Constructor de personaje, hereda de EntidadConMonedas
	 * @param String de nombre
	 * @param byte de dinero
	 * @param short de vida
	 * @param clase Arma de arma(variable interna)
	 * @param clase Proteccion de proteccion(variable interna)
	 * 
	 */
	private String nombre;
	public Personaje(String nombre, byte dinero, short vida, Arma arma, Proteccion proteccion) {
		super(nombre, dinero);
		this.vida = vida;
		this.arma = arma;
		this.proteccion = proteccion;
		
	}
	/**Getter de vida**/
	public short getVida() {
		return vida;
	}
	/**Setter de vida**/
	public void setVida(short vida) {
		this.vida = vida;
	}
	/**Getter de Arma**/
	public Arma getArma() {
		return arma;
	}
	/**Setter de Arma**/
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	/**Getter de Proteccion**/
	public Proteccion getProteccion() {
		return proteccion;
	}
	/**Setter de Proteccion**/
	public void setProteccion(Proteccion proteccion) {
		this.proteccion = proteccion;
	}
	
	
}
