package superclases;

import excepciones.NombreVacioException;
import superclases.EntidadConMonedas;

/**
 * Represntará un objeto, el cual será una pocion, un arma o una proteccion
 * 
 * @author Antonio Jesus Rodriguez
 *
 */
public abstract class Objeto extends EntidadConMonedas {

	/**
	 * Representa un objeto extiende de EntidadConMonedas
	 * 
	 * @param nombre nombre del objeto
	 * @throws NombreVacioException 
	 * @dinero dinero que cuesta el objeto
	 */
	public Objeto(String nombre, byte dinero) throws NombreVacioException {
		super(nombre, dinero);
	}

}
