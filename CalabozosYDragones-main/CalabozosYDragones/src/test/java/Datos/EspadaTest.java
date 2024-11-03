package Datos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EspadaTest {
    Arma arma;

    @Before
    public void setUp() throws Exception {
        arma  = new Espada();
    }

    @Test
    public void testGetPoder(){
        int obtenido = arma.getPoder();
        assertEquals(10,obtenido);
    }

    @Test
    public void testGetNombre(){
        String obtenido = arma.getNombre();
        assertEquals("Espada",obtenido);
    }

    @Test
    public void testUsar() {
        arma.usar();
    }
}