package clases;

import superclases.EntidadConNombre;
/**
 * Representa una matriz de lugar, que tendra 16 posiciones (4x4), y un jugador, el cual se
 * usara para jugar.
 * @author Marcos Garcia Medina
 *
 */
public class Tablero extends EntidadConNombre {
	/**	lugares representa una matriz de tipo Lugar con 16 lugares diferentes.	**/
	private Lugar[][] lugares;
	/**	personaje representa un jugador de tipo Jugador, el cual se usara para jugar.	**/
	private Jugador personaje;
	
	/**
	 * constructor de tablero
	 * @param lugares matriz de lugares
	 * @param personaje de la clase jugadaor **/
	public Tablero(String nombre, Lugar[][] lugares, Jugador personaje) {
		super(nombre);
		this.lugares = lugares;
		this.personaje = personaje;
	}


/**
 * getter de lugares
 * @return un lugar 
 */
	public Lugar[][] getLugares() {
		return lugares;
	}

/**
 * setter de lugares
 * @param lugares matriz de lugares
 */
	public void setLugares(Lugar[][] lugares) {
		this.lugares = lugares;
	}

/**
 * getter de personaje
 * @return personaje 
 */
	public Jugador getPersonaje() {
		return personaje;
	}

/**
 * setter de personaje
 * @param personaje de la clase jugador
 */
	public void setPersonaje(Jugador personaje) {
		this.personaje = personaje;
	}
	
	
}
