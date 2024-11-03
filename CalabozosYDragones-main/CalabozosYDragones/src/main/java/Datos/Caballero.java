package Datos;

public class Caballero extends Personaje {
    public Caballero(Arma armaInicial) {
        super("Caballero", 3, armaInicial);
    }

    @Override
    public void display() {
        System.out.println("Soy el Caballero con poder:3 con "+getArmaActual().getNombre()+
                " de poder: "+getArmaActual().getPoder()+" (poder total "+getPoderTotal()+")");
    }
}
