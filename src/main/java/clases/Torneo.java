package clases;

import java.util.ArrayList;

public class Torneo {
	private ArrayList<Ronda> rondas;
	private Personaje[] participantesIniciales;
	
	public Torneo(Personaje [] partInic) {
		super();
		this.participantesIniciales=partInic;
		rondas=new ArrayList<Ronda>();
	}

	public ArrayList<Ronda> getRondas() {
		return rondas;
	}

	public void setRondas(ArrayList<Ronda> rondas) {
		this.rondas = rondas;
	}

	public Personaje[] getParticipantesIniciales() {
		return participantesIniciales;
	}

	public void setParticipantesIniciales(Personaje[] participantesIniciales) {
		this.participantesIniciales = participantesIniciales;
	}
	
	
	
	
}
