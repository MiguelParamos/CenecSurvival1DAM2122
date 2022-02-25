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
}
