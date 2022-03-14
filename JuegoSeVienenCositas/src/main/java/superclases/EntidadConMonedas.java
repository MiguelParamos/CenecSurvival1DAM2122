package superclases;

/**
 * Representa una entidad con monedas con un dato tipo byte que va a representar el dinero que tenga cada personaje o el dinero
 * que se pueda encontrar un personaje en el tablero.
 * @author Leticia García
 *
 */
public class EntidadConMonedas extends EntidadConNombre {
	/**Representa un objeto que lleva el personaje con el que puede comprar cosas (armas, proteccion o pociones)**/
	private byte dinero;

	/**
	 * Constuctor de la entidad con monedas
	 * @param nombre El nombre que tendrá la entidad
	 * @param dinero La cantidad de monedas que tendrá la entidad
	 */
	
	public EntidadConMonedas(String nombre, byte dinero) {
		super(nombre);
		this.dinero = dinero;
	}


	/**
	 * Getter de dinero
	 * @return El dinero que tiene la entidad
	 */
	
	public byte getDinero() {
		return dinero;
	}
	/**
	 * Setter de dinero
	 * @param dinero Especificas el dinero que tendrá la entidad
	 */
	public void setDinero(byte dinero) {
		this.dinero = dinero;
	}
	
	
}
