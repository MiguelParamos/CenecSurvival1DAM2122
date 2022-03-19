package superclases;

/**
 * Representa una entidad con un nombre concreto
 * 
 * @author Miguel Páramos
 *
 */
public abstract class EntidadConNombre {
	/** nombre del elemento **/
	private String nombre;

	/**
	 * Constructor de la clase nombre, solo recibe el nombre
	 * 
	 * @param nombre el nombre que tendrá la entidad
	 */
	public EntidadConNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * getter de nombre
	 * 
	 * @return nombre de la entidad
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter de nombre
	 * 
	 * @param nombre nuevo nombre que tendra la entidad
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
