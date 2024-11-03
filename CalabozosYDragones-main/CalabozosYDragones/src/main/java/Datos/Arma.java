package Datos;

public abstract class Arma {

    private String nombre;
    private int poder;

    public Arma(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }
    public abstract void usar();
}

