package Logica;
import Datos.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneradorDeArmasTest {


    @Test
    public void generarArmaAleatoria() {
        Arma arma = GeneradorDeArmas.generarArmaAleatoria();
        System.out.println(arma.getNombre());
        assertNotNull(arma);
    }
}