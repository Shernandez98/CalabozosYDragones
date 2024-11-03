package Logica;
import Datos.*;
import java.util.Random;

public class GeneradorDeArmas {
    private static final Random random = new Random();

    public static Arma generarArmaAleatoria() {
        int tipoArma = random.nextInt(4);
        switch (tipoArma) {
            case 0:
                return new Espada();
            case 1:
                return new ArcoYFlecha();
            case 2:
                return new Hacha();
            case 3:
                return new Cuchillo();
            default:
                return new Espada();
        }
    }
}