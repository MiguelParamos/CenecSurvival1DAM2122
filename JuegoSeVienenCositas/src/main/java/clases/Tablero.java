package clases;

import java.util.ArrayList;
import java.util.Random;

import superclases.EntidadConNombre;
import superclases.Objeto;

/**
 * Representa una matriz de lugar, que tendra 16 posiciones (4x4), y un jugador,
 * el cual se usara para jugar.
 * 
 * @author Marcos Garcia Medina
 *
 */
public class Tablero extends EntidadConNombre {
	/** lugares representa una matriz de tipo Lugar con 16 lugares diferentes. **/
	private Lugar[][] lugares;
	/**
	 * personaje representa un jugador de tipo Jugador, el cual se usara para jugar.
	 **/
	private Jugador personaje;

	/**
	 * constructor de tablero
	 * 
	 * @param lugares   matriz de lugares
	 * @param personaje de la clase jugadaor
	 **/
	public Tablero(String nombreJugador) {
		super("cermuzo");
		this.lugares = lugares;

		this.lugares = new Lugar[4][4];

		this.lugares[0][0] = new Lugar("Sala1", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[0][1] = new Lugar("Sala2", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[0][2] = new Lugar("Sala3", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[0][3] = new Lugar("Sala4", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[1][0] = new Lugar("Sala5", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[1][1] = new Lugar("Sala6", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[1][2] = new Lugar("Sala7", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[1][3] = new Lugar("Sala8", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[2][0] = new Lugar("Sala9", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[2][1] = new Lugar("Sala10", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[2][2] = new Lugar("Sala11", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[2][3] = new Lugar("Sala12", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[3][0] = new Lugar("Sala13", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[3][1] = new Lugar("Sala14", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[3][2] = new Lugar("Sala15", "Descripcion de ejemplo,no sé me da pereza");
		this.lugares[3][3] = new Lugar("Sala16", "Descripcion de ejemplo,no sé me da pereza");

		Arma arma1 = new Arma("McAitana", (byte) 50, (byte) 50);
		Arma arma2 = new Arma("El mensajero del mensajero", (byte) 50, (byte) 50);
		Arma arma3 = new Arma("Asistencia de Marcos", (byte) 50, (byte) 50);
		Arma arma4 = new Arma("Subnáutica", (byte) 50, (byte) 50);

		Proteccion defensa1 = new Proteccion("CEO del KFC", (byte) 50, (byte) 50);
		Proteccion defensa2 = new Proteccion("Zielinski", (byte) 50, (byte) 50);
		Proteccion defensa3 = new Proteccion("Masi", (byte) 50, (byte) 0);
		Proteccion defensa4 = new Proteccion("Llorar por las noches", (byte) 50, (byte) 50);

		Random r = new Random();

		Enemigo enemigo1 = new Enemigo("Skippy", (byte) r.nextInt(((25 - 5) + 5)), (byte) 100, arma2, defensa1, false);
		Enemigo enemigo2 = new Enemigo("IlloJuan", (byte) r.nextInt(((25 - 5) + 5)), (byte) 100, arma4, defensa3,
				false);
		Enemigo enemigo3 = new Enemigo("Marcos", (byte) r.nextInt(((25 - 5) + 5)), (byte) 100, arma3, defensa4, false);
		Enemigo enemigo4 = new Enemigo("Putin", (byte) r.nextInt(((25 - 5) + 5)), (byte) 100, arma1, defensa2, false);

		Arma arma5 = new Arma("RickRoll", (byte) 80, (byte) 99);
		Proteccion defensa5 = new Proteccion("Average Internet troll", (byte) 99, (byte) 99);

		Enemigo enemigoFinal = new Enemigo("Rick Astley", (byte) r.nextInt(((25 - 5) + 5)), (byte) 100, arma5, defensa5,
				true);
		Enemigo[] enemigosMundo = { enemigo1, enemigo2, enemigo3, enemigo4, enemigoFinal };

		Pocion pocion1 = new Pocion("ibuprofeno y pal cole", (byte) 15, (byte) 5);
		Pocion pocion2 = new Pocion("chancletazo en la nalga", (byte) 30, (byte) 1);
		Pocion pocion3 = new Pocion("McFlurry", (byte) 30, (byte) 25);
		Pocion pocion4 = new Pocion("Vix Vaporub", (byte) 65, (byte) 50);

		Pocion[] pocionesMundo = { pocion1, pocion2, pocion3, pocion4 };

		Arma armaTienda1 = new Arma("Vómito de nyan cat", (byte) 50, (byte) 50);
		Arma armaTienda2 = new Arma("Benzema contra el PSG", (byte) 50, (byte) 100);
		Arma armaTienda3 = new Arma("Un buen SIUUUUUU del bicho", (byte) 50, (byte) 50);

		Proteccion defensaTienda1 = new Proteccion("Poder de la amistad", (byte) 50, (byte) 100);
		Proteccion defensaTienda2 = new Proteccion("Militao", (byte) 50, (byte) 50);
		Proteccion defensaTienda3 = new Proteccion("Dinero del Al-Khelaifi", (byte) 50, (byte) 1);

		Pocion pocionTienda1 = new Pocion("Coca-cola espuma", (byte) 65, (byte) 50);
		Pocion pocionTienda2 = new Pocion("stoic mike wazowski", (byte) 65, (byte) 50);
		Pocion pocionTienda3 = new Pocion("La roca Johnson", (byte) 65, (byte) 50);

		ArrayList<Objeto> articulos = new ArrayList<Objeto>();

		articulos.add(armaTienda1);
		articulos.add(armaTienda2);
		articulos.add(armaTienda3);

		articulos.add(defensaTienda1);
		articulos.add(defensaTienda2);
		articulos.add(defensaTienda3);

		articulos.add(pocionTienda1);
		articulos.add(pocionTienda2);
		articulos.add(pocionTienda3);

		Tienda coviran = new Tienda(articulos);

		byte fila1;
		byte columna1;

		byte i = 0;

		while (i < pocionesMundo.length) {

			fila1 = (byte) r.nextInt(((3 - 0) + 0));
			columna1 = (byte) r.nextInt(((3 - 0) + 0));

			if (this.lugares[fila1][columna1].getPocion() != null) {

			} else {
				this.lugares[fila1][columna1].setPocion(pocionesMundo[i]);
				i++;
			}

		}
		i = 0;
		while (i < enemigosMundo.length) {

			fila1 = (byte) r.nextInt(((3 - 0) + 0));
			columna1 = (byte) r.nextInt(((3 - 0) + 0));

			if (this.lugares[fila1][columna1].getEnemigo() != null) {

			} else {
				this.lugares[fila1][columna1].setEnemigo(enemigosMundo[i]);
				i++;
			}

		}
		fila1 = (byte) r.nextInt(((3 - 0) + 0));
		columna1 = (byte) r.nextInt(((3 - 0) + 0));

		this.lugares[fila1][columna1].setTienda(coviran);

		i = 0;

		while (i < 5) {

			fila1 = (byte) r.nextInt(((3 - 0) + 0));
			columna1 = (byte) r.nextInt(((3 - 0) + 0));

			if (this.lugares[fila1][columna1].getDinero() != 0) {

			} else {
				this.lugares[fila1][columna1].setDinero((byte) r.nextInt(((100 - 0) + 0)));
				i++;
			}

		}

	}

	/**
	 * getter de lugares
	 * 
	 * @return un lugar
	 */
	public Lugar[][] getLugares() {
		return lugares;
	}

	/**
	 * setter de lugares
	 * 
	 * @param lugares matriz de lugares
	 */
	public void setLugares(Lugar[][] lugares) {
		this.lugares = lugares;
	}

	/**
	 * getter de personaje
	 * 
	 * @return personaje
	 */
	public Jugador getPersonaje() {
		return personaje;
	}

	/**
	 * setter de personaje
	 * 
	 * @param personaje de la clase jugador
	 */
	public void setPersonaje(Jugador personaje) {
		this.personaje = personaje;
	}

}
