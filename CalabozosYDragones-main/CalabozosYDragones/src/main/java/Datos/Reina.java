package Datos;

public class Reina extends Personaje{
    public Reina(Arma armaInicial) {
        super("Reina", 4, armaInicial);
    }

    @Override
    public void display() {
        System.out.println("Soy la Reina con poder:4 con "+getArmaActual().getNombre()+
                " de poder: "+getArmaActual().getPoder()+" (poder total "+getPoderTotal()+")");

    }
}

