package Datos;

public class Hacha extends Arma {
    public Hacha() {
        super("Hacha", 8);
    }
    @Override
    public void usar() {
        System.out.println("el Hacha");
    }
}