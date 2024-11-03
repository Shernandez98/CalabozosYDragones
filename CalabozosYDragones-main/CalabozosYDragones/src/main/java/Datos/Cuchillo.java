package Datos;

public class Cuchillo extends Arma {

    public Cuchillo() {
        super("Cuchillo", 6);
    }

    @Override
    public void usar() {
        System.out.println("el Cuchillo");
    }
}
