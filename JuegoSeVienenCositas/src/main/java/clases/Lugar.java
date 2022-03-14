package clases;

import superclases.EntidadConMonedas;

/**
 * Representa el lugar donde encontraremos una descripcion, enemigos, tiendas y pociones
 * @author erico
 *
 */
public class Lugar extends EntidadConMonedas {
/** representa el tipo de pocion **/
	private Pocion pocion;
/** representa a los enemigos ubicados en el lugar **/
	private Enemigo enemigo;
/** representa las tiendas ubicadas en el lugar **/
	private Tienda tienda;
/** representa una descripcion del lugar **/
	private String descripcion;
	

/**
 * Constructor de lugar con todos sus campos
 * @author erico
 * @param nombre nombre del lugar
 * @param dinero dinero que deja el enemigo en el lugar
 * @param pocion pociones que encontraremos en el lugar
 * @param enemigo enemigos del lugar
 * @param tienda tiendas que hay en el lugar
 * @param descripcion pequeña descripcion del lugar
 */
public Lugar(String nombre, byte dinero, Pocion pocion, Enemigo enemigo, Tienda tienda, String descripcion) {
	super(nombre, dinero);
	this.pocion = pocion;
	this.enemigo = enemigo;
	this.tienda = tienda;
	this.descripcion = descripcion;
}

public Lugar(String nombre,String descripcion) {
	super(descripcion, nombre);
	this.pocion = null;
	this.enemigo = null;
	this.tienda = null;
	this.descripcion = null;
}

/**
 * getter Pocion
 * @return pocion que hay en el lugar
 */
public Pocion getPocion() {
	return pocion;
}

/** setter Pocion
 * 
 * @param pocion que hay
 */

public void setPocion(Pocion pocion) {
	this.pocion = pocion;
}
/**
 * getter Eemigo
 * @return los enemigos que hay
 */
public Enemigo getEnemigo() {
	return enemigo;
}
/**
 * setter Enemigo
 * @param enemigo que hay
 */
public void setEnemigo(Enemigo enemigo) {
	this.enemigo = enemigo;
}
/**
 * getter tienda
 * @return tienda que hay
 */
public Tienda getTienda() {
	return tienda;
}
/**
 * setter tienda
 * @param tienda que hay
 */
public void setTienda(Tienda tienda) {
	this.tienda = tienda;
}
/**
 * getter descripcion
 * @return te devuelve la descripcion del lugar
 */
public String getDescripcion() {
	return descripcion;
}
/**
 * setter descripcion
 * @param descripcion que hay
 */
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

}
