package Principal;
import Datos.*;
import Logica.*;


public class Main {
    public static void main(String[] args) {
        //Genero los personajes aleatoriamente con armas aleatorias
        Personaje p1 = GeneradorDePersonaje.generarPersonajeAleatorio();
        Personaje p2 = GeneradorDePersonaje.generarPersonajeAleatorio();
        Personaje p3 = GeneradorDePersonaje.generarPersonajeAleatorio();
        Personaje p4 = GeneradorDePersonaje.generarPersonajeAleatorio();

        //Les doy un id a cada personaje para que se distingan si se repiten
        p1.setNombre("J1:"+ p1.getNombre());
        p2.setNombre("J2:"+ p2.getNombre());
        p3.setNombre("J3:"+ p3.getNombre());
        p4.setNombre("J4:"+ p4.getNombre());

        //Se presentan los jugadores creados con sus respectivas armas
        System.out.print("J1:");p1.display();
        System.out.print("J2:");p2.display();
        System.out.print("J3:");p3.display();
        System.out.print("J4:");p4.display();

        System.out.println("Simulando combate...");
        SimuladorCombate.simularCombate(p1,p2);
        SimuladorCombate.simularCombate(p3,p4);
    }
}

