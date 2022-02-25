package clases;
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
}
