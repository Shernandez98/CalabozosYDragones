package Logica;
import Datos.Personaje;
import java.util.Random;

public class SimuladorCombate {


    public static void simularCombate(Personaje p1, Personaje p2) {
        p1.atacar();
        p2.atacar();


        if (p1.getPoderTotal()>p2.getPoderTotal()){
            System.out.println(p1.getNombre() + " gana el combate con un poder total de " + p1.getPoderTotal()+", contra " + p2.getNombre()+" con poder total: "+p2.getPoderTotal());
        }else if (p1.getPoderTotal()<p2.getPoderTotal()){
            System.out.println(p2.getNombre() + " gana el combate con un poder total de " + p2.getPoderTotal()+", contra " + p1.getNombre()+" con poder total: "+p1.getPoderTotal());
        }else {
            System.out.println("Espera, "+p1.getNombre()+" tiene el mismo poder total que "+p2.getNombre()+" se irán a muerte subita, ambos cambiaran de arma");
            p1.cambiarArma(GeneradorDeArmas.generarArmaAleatoria());
            System.out.println("Nueva arma para "+p1.getNombre()+" "+p1.getArmaActual().getNombre());
            p2.cambiarArma(GeneradorDeArmas.generarArmaAleatoria());
            System.out.println("Nueva arma para "+p2.getNombre()+" "+p2.getArmaActual().getNombre());
            simularCombate(p1, p2);
        }
    }
}
