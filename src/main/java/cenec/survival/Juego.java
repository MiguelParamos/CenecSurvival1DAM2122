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
		armasPosibles.add(new Arma("Chusta de canuto", (byte)15));
		armasPosibles.add(new Arma("Zapatilla voladora",(byte)20));
		armasPosibles.add(new Arma("Alpargata",(byte)20));
		armasPosibles.add(new Arma("teclado custom",(byte)13));
		armasPosibles.add(new Arma("Machetón",(byte)15));
		armasPosibles.add(new Arma("Silla de Echenique",(byte)13));
		armasPosibles.add(new Arma("Ray Gun m2",(byte)20));
		armasPosibles.add(new Arma("Impuestos",(byte)20));
		armasPosibles.add(new Arma("FlechaLanzaArcos",(byte)14));
		armasPosibles.add(new Arma("Boli",(byte)14));
		armasPosibles.add(new Arma("Frostmure",(byte)14));
		armasPosibles.add(new Arma("Biblia",(byte)13));
		armasPosibles.add(new Arma("Mechero de la Sole",(byte)14));
		armasPosibles.add(new Arma("Miguel careta caballo",(byte)20));
		armasPosibles.add(new Arma("bebe volador",(byte)15));
		armasPosibles.add(new Arma("Chancla de madre",(byte)14));
		armasPosibles.add(new Arma("Martillo de TORBE",(byte)14));
		armasPosibles.add(new Arma("palo radiactivo", (byte) 15));
		armasPosibles.add(new Arma("Golem de Willyrex", (byte) 15));
		armasPosibles.add(new Arma("Maldición Gitana", (byte) 17));
		armasPosibles.add(new Arma("El mensajero del mensajero", (byte) 20));
		
		ArrayList<Proteccion> proteccionesPosibles=new ArrayList<Proteccion>();
		proteccionesPosibles.add(new Proteccion("Carpincho",(byte)20)); 
		proteccionesPosibles.add(new Proteccion("Pato de Goma",(byte)5));
		proteccionesPosibles.add(new Proteccion("Escudo Hyliano",(byte)20));
		proteccionesPosibles.add(new Proteccion("Careta de Pedro Sanchez",(byte)20));
		proteccionesPosibles.add(new Proteccion("Escudo de papel", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Silla de plastico",(byte)5));
		proteccionesPosibles.add(new Proteccion("Sustituto",(byte)10));
		proteccionesPosibles.add(new Proteccion("Refrigeracion liquida",(byte)7));
		proteccionesPosibles.add(new Proteccion("Ser furry",(byte)13));
		proteccionesPosibles.add(new Proteccion("La asistencia de Marcos",(byte)17));
		proteccionesPosibles.add(new Proteccion("Esclava de la Virgen Maria",(byte)16));
		proteccionesPosibles.add(new Proteccion("Jose Carlos",(byte)12));
		proteccionesPosibles.add(new Proteccion("Hacienda",(byte)20));
		proteccionesPosibles.add(new Proteccion("escudo de papel mojado",(byte)15));
		proteccionesPosibles.add(new Proteccion("Toison de oro",(byte)15));
		proteccionesPosibles.add(new Proteccion("Jesuscristo",(byte)16));
		proteccionesPosibles.add(new Proteccion("No mirar",(byte)15));
		proteccionesPosibles.add(new Proteccion("Cigala fumando",(byte)16));
		proteccionesPosibles.add(new Proteccion("Mi suegra",(byte)15));
		proteccionesPosibles.add(new Proteccion("Caja de Donuts",(byte)15));
		proteccionesPosibles.add(new Proteccion("Seta gigante ", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Mayichi gitana ", (byte) 20));
		proteccionesPosibles.add(new Proteccion("Ojo de Horus", (byte) 20));
		proteccionesPosibles.add(new Proteccion("El apocolipsis", (byte) 20));
		
		Random r=new Random();
		Personaje juanmi=new Personaje("Juanmi",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje eric=new Personaje("Eric",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje miguel=new Personaje("Miguel PÃ¡ramos",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje leti=new Personaje("Leti",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje aleB = new Personaje("Ale Barrionuevo", armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje antonio = new Personaje("Antonio", armasPosibles.get(r.nextInt(armasPosibles.size())),
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje joaquin = new Personaje("Joaquin Moreno", armasPosibles.get(r.nextInt(armasPosibles.size())), 
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje alexis=new Personaje("Alexis",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje juan=new Personaje("Juan",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje agustin=new Personaje("AgustÃ­n",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje juanjo=new Personaje("Juanjo",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje pepeB = new Personaje("Pepe Botella", armasPosibles.get(r.nextInt(armasPosibles.size())),
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje jero=new Personaje("Jero",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje ignacio=new Personaje("Ignacio",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje guille = new Personaje("guille", armasPosibles.get(r.nextInt(armasPosibles.size())),
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		
		Personaje aleAsencio = new Personaje("Ale Asencio", armasPosibles.get(r.nextInt(armasPosibles.size())),
                proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje gonzalo=new Personaje("Testigos de jehova",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje cristian = new Personaje("Cristian", armasPosibles.get(r.nextInt(armasPosibles.size())),
				proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje abelR = new Personaje("Abel", armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje alexL = new Personaje("Alex Lopez", armasPosibles.get(r.nextInt(armasPosibles.size())),
			    proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje joseLui = new Personaje("Jose Luis", armasPosibles.get(r.nextInt(armasPosibles.size())),
			    proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje david=new Personaje("David",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		Personaje skippy=new Personaje("Skippy",armasPosibles.get(r.nextInt(armasPosibles.size())),proteccionesPosibles.get(r.nextInt(proteccionesPosibles.size())));
		
		Personaje[] personajesPosibles = {david,joseLui,alexL,abelR, aleAsencio,cristian,gonzalo,guille,antonio,juanjo, juanmi, eric,leti, miguel,aleB,joaquin,alexis,juan, jero, pepeB,agustin, ignacio,skippy };
		
		
		Combate pelea1=new Combate(personajesPosibles[r.nextInt(personajesPosibles.length)],personajesPosibles[r.nextInt(personajesPosibles.length)]);
		pelea1.combatir();
		
	}

}
