package clases;

import excepciones.GeneroInvalidoException;
import excepciones.NombreVacioException;

/**
 * Representa un enemigo con vida, nombre un arma y proteccion que puede ser o
 * no el enemigo final
 * 
 * @author GUILLE
 *
 */
public class Enemigo extends Personaje {
	/**
	 * Representa la posiblidad de que el enemigo que salga sea el boss final o no
	 */
	private boolean esFinal;

	/**
	 * Constructor de enemigo con todos los campos internos
	 * 
	 * @param nombre     nombre del enemigo que se creará
	 * @param genero     género del enemigo. Solo puede ser 'm' (masculino) o 'f'
	 *                   (femenino)
	 * @param dinero     dinero con el que cuenta el Enemigo, que droppeará al morir
	 * @param vida       vida inicial del enemigo
	 * @param arma       arma inicial del enemigo
	 * @param proteccion proteccion inicial del enemigo
	 * @param esFinal    boolean que indica si es el boss final (cuando se mata el
	 *                   juego acaba) o no.
	 * @throws GeneroInvalidoException 
	 * @throws NombreVacioException 
	 */
	public Enemigo(String nombre, char genero, byte dinero, short vida, Arma arma, Proteccion proteccion,
			boolean esFinal) throws GeneroInvalidoException, NombreVacioException {
		super(nombre, genero, dinero, vida, arma, proteccion);
		this.esFinal = esFinal;
	}

	/**
	 * getter que indica si el enemigo es el enemigo final o no
	 * 
	 * @return true si es el enemigo final, false si no lo es.
	 */
	public boolean isEsFinal() {
		return esFinal;
	}

	/**
	 * función toString, que muestra la información del objeto
	 * 
	 * @return String con la información del objeto, indicando si es boss final
	 */
	@Override
	public String toString() {
		return (this.esFinal ? "------BOSS FINAL------\n" : "") + super.toString();
	}

}
