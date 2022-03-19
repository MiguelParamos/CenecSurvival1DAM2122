package superclases;

import superclases.EntidadConMonedas;

/**
 * Represntará un objeto, el cual será una pocion, un arma o una proteccion
 * 
 * @author Antonio Jesus Rodriguez
 *
 */
public abstract class Objeto extends EntidadConMonedas {

	/**
	 * Representa un objeto estiende de EntidadConMonedas
	 * 
	 * @param nombre nombre del objeto
	 * @dinero dinero que cuesta el objeto
	 */
	public Objeto(String nombre, byte dinero) {
		super(nombre, dinero);
		// TODO Auto-generated constructor stub
	}

}
