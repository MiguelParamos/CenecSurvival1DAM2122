package clases;

import java.util.ArrayList;

import superclases.Objeto;
/**
 * Representa una tienda en la que el jugador puede comprar armas, protecciones o pociones.
 * @author Juanmi Moreno
 *@version 1
 */
public class Tienda {
	/**Representa una lista de armas que se puede comprar**/
	private ArrayList<Objeto> articulosEnVenta;

	public Tienda() {
		super();
		this.articulosEnVenta = new ArrayList<Objeto>();

		Arma espada=new Arma("Espada",(byte)30,(byte)12);
		Proteccion escudo=new Proteccion("Escudo",(byte)30,(byte)12);
		
		this.articulosEnVenta.add(espada);
		this.articulosEnVenta.add(escudo);
	}
	
	
}
