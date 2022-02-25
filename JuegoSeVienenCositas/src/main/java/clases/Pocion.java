package clases;

public class Pocion {
    private byte cantidadPuntoRestaurados;

    public Pocion(byte cantidadPuntoRestaurados) {
        this.cantidadPuntoRestaurados = cantidadPuntoRestaurados;
    }

    public byte getCantidadPuntoRestaurados() {
        return this.cantidadPuntoRestaurados;
    }

    public void setCantidadPuntoRestaurados(byte cantidadPuntoRestaurados) {
        this.cantidadPuntoRestaurados = cantidadPuntoRestaurados;
    }
}