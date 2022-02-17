package cenec.survival;

import clases.Arma;
import clases.Combate;
import clases.Personaje;
import clases.Proteccion;

public class Juego {

	public static void main(String[] args) {
		Arma mataCarpinchos=new Arma("MataCarpinchos",(byte)5);
		Proteccion carpincho=new Proteccion("Carpincho",(byte)20); 
		Personaje juanmi=new Personaje("Juanmi",mataCarpinchos,carpincho);

		Arma cucharaPalo=new Arma("Cuchara de Palo",(byte)20);
		Proteccion patoDeGoma=new Proteccion("Pato de Goma",(byte)5);
		Personaje eric=new Personaje("Eric",cucharaPalo,patoDeGoma);
		

		
		Combate pelea1=new Combate(juanmi,eric);
		pelea1.combatir();
		
		System.out.println(juanmi);
		System.out.println("\nVs\n\n");
		System.out.println(eric);
	}

}
