package se.vienen.cositas.main;

import clases.Arma;
import clases.Proteccion;

public class Juego {

	public static void main(String[] args) {
		Arma espada=new Arma("Espada",(byte)30,(byte)12);
		Proteccion escudo=new Proteccion("Escudo",(byte)30,(byte)12);
		Objeto p=new Objeto("aa",(byte)55);
	}

}
