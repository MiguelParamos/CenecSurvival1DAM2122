package clases;

public class Arma {
	private byte puntosAtaque;
	
	public void setPuntosAtaque(byte pA) {
		if(pA<5||pA>20) {
			System.out.println("Entre 5 y 20");
			this.puntosAtaque=5;
		}else {
			this.puntosAtaque=pA;
		}
		
	}

	public byte getPuntosAtaque() {
		return this.puntosAtaque;
	}
	
}
