package clases;

import java.util.Random;

import excepciones.GeneroInvalidoException;
import excepciones.NombreVacioException;
import interfaces.AccionesPersonaje;
import superclases.EntidadConMonedas;

/**
 * Representa el nombre de un personaje que puede ser jugador o enemigo, su
 * vida, arma y proteccion
 * 
 * @author Cristian Cocargeanu
 */
public class Personaje extends EntidadConMonedas implements AccionesPersonaje {
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
	 * @throws GeneroInvalidoException 
	 * @throws NombreVacioException 
	 */
	public Personaje(String nombre, char genero, byte dinero, short vida, Arma arma, Proteccion proteccion) throws GeneroInvalidoException, NombreVacioException {
		super(nombre, dinero);
		this.vida = vida;
		this.arma = arma;
		this.setGenero(genero);
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
	 * @throws GeneroInvalidoException 
	 */
	public void setGenero(char genero) throws GeneroInvalidoException {
		if (genero == 'm' || genero == 'f') {
			this.genero = genero;
		}else {
			throw new GeneroInvalidoException("El genero "+genero+" no es válido, debió ser m o f");
		}
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
		return this.getNombre() + " " + (genero == 'm' ? "(hombre)" : "(mujer)") + "\n\t" + "Vida: " + this.vida
				+ "\n\t" + "Dinero: " + this.getDinero() + "\n\t" + this.arma + "\n\t" + this.proteccion + "\n";
	}

	public boolean estaVivo() {
		return this.vida > 0;
	}

	public byte atacar() {
		Random r = new Random();
		return (byte) r.nextInt(this.arma.getPuntosAtaque() + 1);
	}

}
