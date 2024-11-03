package Datos;

public class ArcoYFlecha extends Arma {

    public ArcoYFlecha() {
        super("Arco y flechas", 7);
    }

    @Override
    public void usar() {
        System.out.println("el Arco y flecha");
    }
}
