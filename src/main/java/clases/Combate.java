package clases;

public class Combate {
	private short turno;
	private Personaje participante1;
	private Personaje participante2;
	private Personaje ganador;
	
	public Combate(Personaje participante1, Personaje participante2) {
		super();
		this.participante1 = participante1;
		this.participante2 = participante2;
		this.turno=1;
		this.ganador=null;
	}

	public short getTurno() {
		return turno;
	}

	public void setTurno(short turno) {
		this.turno = turno;
	}

	public Personaje getParticipante1() {
		return participante1;
	}

	public void setParticipante1(Personaje participante1) {
		this.participante1 = participante1;
	}

	public Personaje getParticipante2() {
		return participante2;
	}

	public void setParticipante2(Personaje participante2) {
		this.participante2 = participante2;
	}

	public Personaje getGanador() {
		return ganador;
	}

	public void setGanador(Personaje ganador) {
		this.ganador = ganador;
	}
	
	
	
	
}
