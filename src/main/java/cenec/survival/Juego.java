package cenec.survival;

import java.util.ArrayList;
import java.util.Random;

import clases.Arma;
import clases.Combate;
import clases.Personaje;
import clases.Proteccion;

public class Juego {

	public static void main(String[] args) {
		ArrayList<Arma> armasPosibles=new ArrayList<Arma>();
		armasPosibles.add(new Arma("MataCarpinchos",(byte)15));
		armasPosibles.add(new Arma("Cuchara de Palo",(byte)20));
		armasPosibles.add(new Arma("Botijo nuclear",(byte)17));
		armasPosibles.add(new Arma("Zapatilla voladora",(byte)20));
		
		armasPosibles.add(new Arma("teclado custom",(byte)13));
		
		
		
		ArrayList<Proteccion> proteccionesPosibles=new ArrayList<Proteccion>();
		proteccionesPosibles.add(new Proteccion("Carpincho",(byte)20)); 
		proteccionesPosibles.add(new Proteccion("Pato de Goma",(byte)5));
		proteccionesPosibles.add(new Proteccion("Careta de Pedro Sanchez",(byte)20));
		proteccionesPosibles.add(new Proteccion("Silla de plastico",(byte)5));
		
		proteccionesPosibles.add(new Proteccion("Refrigeracion liquida",(byte)7));
		
		
		Random r=new Random();
		
		Personaje juanmi=new Personaje("Juanmi",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje eric=new Personaje("Eric",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje miguel=new Personaje("Miguel P�ramos",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		
		Personaje juan=new Personaje("Juan",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));

		
		Personaje juanmi1=new Personaje("Juanmi",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje[] personajesPosibles= {juanmi,juanmi1, eric,miguel,juan};
		

		
		Combate pelea1=new Combate(juanmi,eric);
		pelea1.combatir();
		
	}

}
