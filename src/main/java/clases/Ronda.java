package clases;

import java.util.ArrayList;

public class Ronda {
	private ArrayList<Combate> combates;
	private String nombre;
	
	
	public Ronda(String nombre) {
		super();
		this.nombre = nombre;
		combates=new ArrayList<Combate>();
	}


	public ArrayList<Combate> getCombates() {
		return combates;
	}


	public void setCombates(ArrayList<Combate> combates) {
		this.combates = combates;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
