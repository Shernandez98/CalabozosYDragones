package Datos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HachaTest {
    Arma arma;

    @Before
    public void setUp() throws Exception {
        arma  = new Hacha();
    }

    @Test
    public void testGetPoder(){
        int obtenido = arma.getPoder();
        assertEquals(8,obtenido);
    }

    @Test
    public void testGetNombre(){
        String obtenido = arma.getNombre();
        assertEquals("Hacha",obtenido);
    }

    @Test
    public void testUsar() {
        arma.usar();
    }
}