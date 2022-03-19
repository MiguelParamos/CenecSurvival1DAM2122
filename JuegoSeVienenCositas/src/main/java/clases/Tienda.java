package clases;

import java.util.ArrayList;

import superclases.Objeto;

/**
 * Representa una tienda en la que el jugador puede comprar armas, protecciones
 * o pociones.
 * 
 * @author Juanmi Moreno
 * @version 1
 */
public class Tienda {
	/** Representa una lista de armas que se puede comprar **/
	private ArrayList<Objeto> articulosEnVenta;

	/**
	 * constructor de tienda que recibe todos los objetos que tendrá a la venta
	 * 
	 * @param catalogo de objetos (armas, protecciones o pociones) que tiene a la
	 *                 venta la tienda
	 */
	public Tienda(ArrayList<Objeto> catalogo) {
		this.articulosEnVenta = catalogo;
	}

	/**
	 * obtiene todos los artículos en venta de la tienda
	 * 
	 * @return todos los artículos que vende la tienda
	 */
	public ArrayList<Objeto> getArticulosEnVenta() {
		return articulosEnVenta;
	}

	/**
	 * cambia todos los artículos que la tienda vende, descartando todos los
	 * anteriores
	 * 
	 * @param articulosEnVenta Nuevo conjunto de Objeto (armas, protecciones o
	 *                         pociones) que la tienda venderá
	 */
	public void setArticulosEnVenta(ArrayList<Objeto> articulosEnVenta) {
		this.articulosEnVenta = articulosEnVenta;
	}

}
