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
	public Personaje(String nombre, byte dinero, short vida, Arma arma, Proteccion proteccion, String nombre2) {
		super(nombre, dinero);
		this.vida = vida;
		this.arma = arma;
		this.proteccion = proteccion;
		nombre = nombre2;
	}
	public short getVida() {
		return vida;
	}
	public void setVida(short vida) {
		this.vida = vida;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public Proteccion getProteccion() {
		return proteccion;
	}
	public void setProteccion(Proteccion proteccion) {
		this.proteccion = proteccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
