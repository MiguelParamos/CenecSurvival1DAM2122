package clases;
/**
 * Representa un jugador que cuenta con unas posiciones que se usaran para moverse y localizarlo.
 * @author Gonzalo de Troya
 * 
 */
public class Jugador extends Personaje{
	/**
	 * Representa la posicion de fila  que tendran en el tablero.
	 */
	private byte posicionFila;
	/**
	 * Representa la posicion de columna que tendran en el tablero.
	 */
	private byte posicionCol;
	
	public Jugador(String nombre, byte dinero, short vida, Arma arma, Proteccion proteccion, byte posicionFila,
			byte posicionCol) {
		super(nombre, dinero, vida, arma, proteccion);
		this.posicionFila = posicionFila;
		this.posicionCol = posicionCol;
	}

	public byte getPosicionFila() {
		return posicionFila;
	}

	public void setPosicionFila(byte posicionFila) {
		this.posicionFila = posicionFila;
	}

	public byte getPosicionCol() {
		return posicionCol;
	}

	public void setPosicionCol(byte posicionCol) {
		this.posicionCol = posicionCol;
	}
	
	
	

}
