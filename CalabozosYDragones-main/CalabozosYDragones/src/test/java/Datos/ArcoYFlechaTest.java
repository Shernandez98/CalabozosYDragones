package Datos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArcoYFlechaTest {
    Arma arma;

    @Before
    public void setUp() throws Exception {
        arma = new ArcoYFlecha();
    }

    @Test
    public void testGetPoder(){
        int obtenido = arma.getPoder();
        assertEquals(7,obtenido);
    }

    @Test
    public void testGetNombre(){
        String obtenido = arma.getNombre();
        assertEquals("Arco y flechas",obtenido);
    }

    @Test
    public void testUsar() {
        arma.usar();
    }
}