package se.vienen.cositas.main;

import java.util.Scanner;

import clases.Tablero;
import excepciones.GeneroInvalidoException;
import excepciones.NombreVacioException;

/**
 * Clase principal, donde se desarrollará el juego hasta que acabe
 * 
 * @author Miguel Páramos
 *
 */
public class Juego {

	/**
	 * Función principal. Primero se pide género y nombre del jugador/a , y luego se
	 * inicia el bucle del juego, que durará hasta que el boss final muera, o el
	 * jugador muera.
	 * 
	 * @param args sin utilizar.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenid@ a esta gran aventura, en la que probablemente mueras.");
		System.out.println("Espera lo mejor, prepárate para lo peor, porque se vienen cositas...");
		System.out.println("-------------------------------------------------------------------\n\n");

	
		Tablero tablero=null;
		boolean tableroOk=true;
		do {
			try {
				System.out.println("Elige el género de tu personaje (m - masculino /f - femenino): ");
				char genero = sc.nextLine().charAt(0);
	
				System.out.println("Jugador" + (genero == 'f' ? "a" : "") + ", introduce tu nombre:");
				String nombre = sc.nextLine();
				System.out.println("\n");
				
				tablero = new Tablero(nombre, genero);
				tableroOk=true;
			} catch (GeneroInvalidoException | NombreVacioException e) {
				System.out.println(e.getMessage());
				tableroOk=false;
			}
		}while(!tableroOk);
		
		//Aquí comenzaría el bucle del juego.
		//while(tablero.getPersonaje().estaVivo()){
			System.out.println(tablero.getPersonaje());
			System.out.println(tablero.getLugares()[tablero.getPersonaje().getPosicionFila()][tablero.getPersonaje().getPosicionCol()]);
	
			System.out.println("Aún no puedes interaccionar con los objetos y los enemigos, porque aún no está implementado.");
			//System.out.println("Selecciona una dirección a la que ir:\n\tn - Norte\n\ts - Sur\n\te - Este\n\to - Oeste");
			//char direccionElegida=sc.nextLine().charAt(0);
		//} //Cierre del while
	}

}
