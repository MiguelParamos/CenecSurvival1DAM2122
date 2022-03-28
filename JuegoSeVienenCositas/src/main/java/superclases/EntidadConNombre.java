package superclases;

import excepciones.NombreVacioException;

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
	 * @throws NombreVacioException 
	 */
	public EntidadConNombre(String nombre) throws NombreVacioException {
		super();
		this.setNombre(nombre);
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
	 * @throws NombreVacioException 
	 */
	public void setNombre(String nombre) throws NombreVacioException {
		if(!nombre.isBlank()) {
			this.nombre = nombre;
		}else {
			throw new NombreVacioException("El nombre no puede estar vacío");
		}
	}

}
