package Datos;

public class Rey extends Personaje {
    public Rey(Arma armaInicial) {
        super("Rey", 5, armaInicial);
    }

    @Override
    public void display() {
        System.out.println("Soy el Rey con poder:5 con "+getArmaActual().getNombre()+
                " de poder: "+getArmaActual().getPoder()+" (poder total "+getPoderTotal()+")");

    }
}
