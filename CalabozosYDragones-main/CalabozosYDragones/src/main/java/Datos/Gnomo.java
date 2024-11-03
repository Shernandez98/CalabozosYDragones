package Datos;

public class Gnomo extends Personaje {
    public Gnomo(Arma armaInicial) {
        super("Gnomo", 2, armaInicial);
    }

    @Override
    public void display() {
        System.out.println("Soy el Gnomo con poder:2 con "+getArmaActual().getNombre()+
                " de poder: "+getArmaActual().getPoder()+" (poder total "+getPoderTotal()+")");

    }
}