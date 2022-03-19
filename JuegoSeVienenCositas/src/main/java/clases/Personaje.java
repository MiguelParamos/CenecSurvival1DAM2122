package clases;

import superclases.EntidadConMonedas;

/**
 * Representa el nombre de un personaje que puede ser jugador o enemigo, su
 * vida, arma y proteccion
 * 
 * @author Cristian Cocargeanu
 */
public class Personaje extends EntidadConMonedas {
	/**
	 * Representa los puntos de vida del personaje
	 */
	private short vida;
	/**
	 * Almacena el Arma que tiene actualmente el Personaje.
	 */
	private Arma arma;
	/**
	 * Almacena la protección que tiene actualmente el Personaje.
	 */
	private Proteccion proteccion;

	/**
	 * Representa el género del personaje: 'm' para masculino, y 'f' para femenino.
	 * Ningún otro valor es válido
	 */
	private char genero;

	/**
	 * Constructor de personaje con todos sus campos
	 * 
	 * @param nombre     nombre del personaje
	 * @param genero     género del enemigo. Solo puede ser 'm' (masculino) o 'f'
	 *                   (femenino)
	 * @param dinero     dinero inicial del personaje
	 * @param vida       cantidad inicial de vida del personaje
	 * @param arma       arma inicial del personaje
	 * @param proteccion protección inicial del personaje
	 */
	public Personaje(String nombre, char genero, byte dinero, short vida, Arma arma, Proteccion proteccion) {
		super(nombre, dinero);
		this.vida = vida;
		this.arma = arma;
		this.genero = genero;
		this.proteccion = proteccion;
	}

	/**
	 * obtiene el género del personaje, devolverá 'm' (masculino) o 'f' (femenino)
	 * 
	 * @return género del personaje, solo puede devolver 'm' (masculino) o 'f'
	 *         (femenino)
	 */
	public char getGenero() {
		return genero;
	}

	/**
	 * cambia el género del personaje. Solo puede ser 'm' (masculino) o 'f' (femenin
	 * 
	 * @param genero nuevo genero del personaje. Solo puede ser 'm' (masculino) o
	 *               'f' (femenino)
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}

	/**
	 * obtiene la cantidad de vida actual del personaje
	 * 
	 * @return cantidad de vida actual del personaje
	 */
	public short getVida() {
		return vida;
	}

	/**
	 * cambia el valor a la vida del personaje
	 * 
	 * @param vida nuevo valor de la vida del personaje
	 */
	public void setVida(short vida) {
		this.vida = vida;
	}

	/**
	 * devuelve el arma actual del personaje
	 * 
	 * @return arma actual del personaje
	 */
	public Arma getArma() {
		return arma;
	}

	/**
	 * establece el arma actual del personaje, descartando la anterior
	 * 
	 * @param arma nueva arma que tendrá el personaje
	 */
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	/**
	 * devuelve la protección actual del personaje
	 * 
	 * @return protección actual del personaje
	 */
	public Proteccion getProteccion() {
		return proteccion;
	}

	/**
	 * establece la protección actual del personaje, descartando la anterior
	 * 
	 * @param proteccion nueva protección que tendrá el personaje
	 */
	public void setProteccion(Proteccion proteccion) {
		this.proteccion = proteccion;
	}

	/**
	 * función toString, que muestra la información del objeto
	 * 
	 * @return String con la información del personaje en varias líneas
	 */
	@Override
	public String toString() {
		return this.getNombre() + " " + (genero == 'm' ? "(hombre)" : "(mujer)") + "\n\t" + "Vida: " + this.getVida()
				+ "\n\t" + "Dinero: " + this.getDinero() + "\n\t" + this.arma + "\n\t" + this.proteccion + "\n";
	}

}
