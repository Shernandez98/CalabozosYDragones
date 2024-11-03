package Datos;

public class Espada extends Arma {

    public Espada() {
        super("Espada", 10);
    }

    @Override
    public void usar() {
        System.out.println("la Espada");
    }
}
