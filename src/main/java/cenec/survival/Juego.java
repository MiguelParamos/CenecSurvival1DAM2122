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
		armasPosibles.add(new Arma("Espada Maestra",(byte)15));
		armasPosibles.add(new Arma("Botijo nuclear",(byte)17));
		armasPosibles.add(new Arma("Palillo de oido", (byte) 20));
		
		
		
		ArrayList<Proteccion> proteccionesPosibles=new ArrayList<Proteccion>();
		proteccionesPosibles.add(new Proteccion("Carpincho",(byte)20)); 
		proteccionesPosibles.add(new Proteccion("Pato de Goma",(byte)5));
		proteccionesPosibles.add(new Proteccion("Escudo Hyliano",(byte)20));
		proteccionesPosibles.add(new Proteccion("Careta de Pedro Sanchez",(byte)20));
		proteccionesPosibles.add(new Proteccion("Escudo de papel", (byte) 20));
		
		
		Random r=new Random();
		Personaje juanmi=new Personaje("Juanmi",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje eric=new Personaje("Eric",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje miguel=new Personaje("Leti",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje leti=new Personaje("Miguel P�ramos",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje aleB = new Personaje("Ale Barrionuevo", armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje[] personajesPosibles= {juanmi,eric,leti,miguel,};
		

		
		Combate pelea1=new Combate(juanmi,eric);

		ArrayList<Arma> armasPosibles = new ArrayList<Arma>();
		armasPosibles.add(new Arma("MataCarpinchos", (byte) 15));
		armasPosibles.add(new Arma("Cuchara de Palo", (byte) 20));
		armasPosibles.add(new Arma("Botijo nuclear", (byte) 17));
		armasPosibles.add(new Arma("Palillo de oido", (byte) 20));
		armasPosibles.add(new Arma("Chusta de canuto", (byte)15));
		armasPosibles.add(new Arma("Botijo nuclear",(byte)17));
		armasPosibles.add(new Arma("Zapatilla voladora",(byte)20));
		
		
		
		
		
		
		
		
		
		
		armasPosibles.add(new Arma("Impuestos",(byte)20));
		
		
		ArrayList<Proteccion> proteccionesPosibles=new ArrayList<Proteccion>();
		proteccionesPosibles.add(new Proteccion("Carpincho",(byte)20)); 
		proteccionesPosibles.add(new Proteccion("Pato de Goma",(byte)5));
		proteccionesPosibles.add(new Proteccion("Careta de Pedro Sanchez",(byte)20));
		proteccionesPosibles.add(new Proteccion("Silla de plastico",(byte)5));

		proteccionesPosibles.add(new Proteccion("Sustituto",(byte)10));
		proteccionesPosibles.add(new Proteccion("Refrigeracion liquida",(byte)7));
		
		
		Random r = new Random();
		Personaje juanmi = new Personaje("Juanmi", armasPosibles.get(r.nextInt(armasPosibles.size())),
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje eric = new Personaje("Eric", armasPosibles.get(r.nextInt(armasPosibles.size())),
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje miguel = new Personaje("Miguel P�ramos", armasPosibles.get(r.nextInt(armasPosibles.size())),
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje aleB = new Personaje("Ale Barrionuevo", armasPosibles.get(r.nextInt(armasPosibles.size())),
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje joaquin = new Personaje("Joaquin Moreno", armasPosibles.get(r.nextInt(armasPosibles.size())), 
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje alexis=new Personaje("Alexis",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje juan=new Personaje("Juan",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		
		Personaje pepeB = new Personaje("Pepe Botella", armasPosibles.get(r.nextInt(armasPosibles.size())),
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		
		Personaje[] personajesPosibles = { juanmi, eric, miguel,aleB,joaquin,alexis,juan, pepeB };

		
		
		
		
		
		
		
		proteccionesPosibles.add(new Proteccion("Hacienda",(byte)20));
		
		
		
		
		
		
		
		Personaje juanjo=new Personaje("Juanjo",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		
		
		Personaje[] personajesPosibles= {juanmi, eric,miguel,juanjo};
		

		
		Combate pelea1=new Combate(juanmi,eric);
		pelea1.combatir();
		
	}

}
