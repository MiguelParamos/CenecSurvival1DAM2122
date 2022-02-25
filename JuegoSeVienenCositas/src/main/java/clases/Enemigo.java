package clases;
/**
 * Representa un enemigo con vida, nombre un arma y proteccion que puede ser o no el enemigo final
 * @author GUILLE
 *
 */
public class Enemigo extends Personaje {
	/**	Representa la posiblidad de que el enemigo que salga sea el boss final o no */
	private boolean esFinal;

	public Enemigo(String nombre, byte dinero, short vida, Arma arma, Proteccion proteccion, boolean esFinal) {
		super(nombre, dinero, vida, arma, proteccion);
		this.esFinal = esFinal;
	}

	public boolean isEsFinal() {
		return esFinal;
	}

	public void setEsFinal(boolean esFinal) {
		this.esFinal = esFinal;
	}
	
	
}
