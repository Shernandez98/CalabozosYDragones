package Logica;
import Datos.*;
import java.util.Random;

public class GeneradorDePersonaje {
    private static final Random random = new Random();

    public static Personaje generarPersonajeAleatorio() {
        Arma armaInicial = GeneradorDeArmas.generarArmaAleatoria();
        int personajeRand = random.nextInt(4);
        switch (personajeRand) {
            case 0:
                return new Rey(armaInicial);
            case 1:
                return new Reina(armaInicial);
            case 2:
                return new Caballero(armaInicial);
            case 3:
                return new Gnomo(armaInicial);
            default:
                return new Gnomo(armaInicial);
        }
    }
}