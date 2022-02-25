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
	
public Lugar(Pocion pocion, Enemigo enemigo, Tienda tienda, String descripcion) {
	super();
	this.pocion = pocion;
	this.enemigo = enemigo;
	this.tienda = tienda;
	this.descripcion = descripcion;
}

public Pocion getPocion() {
	return pocion;
}

public void setPocion(Pocion pocion) {
	this.pocion = pocion;
}

public Enemigo getEnemigo() {
	return enemigo;
}

public void setEnemigo(Enemigo enemigo) {
	this.enemigo = enemigo;
}

public Tienda getTienda() {
	return tienda;
}

public void setTienda(Tienda tienda) {
	this.tienda = tienda;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

}
